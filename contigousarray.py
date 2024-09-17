#time complexity : o(n)

class Solution(object):
    def findMaxLength(self, nums):
        """
       the logic here is that whenever u find a 0 you will subract 1 and add 1 if you find a 1. You keep a sum adding or subtracting 1's
       on the values youn encounter in the nums array. you keep on adding the sum as key and the value as the index value. (of the sum at that point)
       if the sum is already in the dictionary, it means we have reached the same point. i,e that number of 1's and 0's are equal.

       so if you encounter an already existing sum in the dict1, you subract the current i with value of the already existing value of the sum

       if the count becommes 0, it means you have reached to your starting point and return the index +1
        """
        dict1 = dict()
        count = 0
        maxlen = 0
        for i in range(len(nums)):
            if nums[i] == 1:
                count = count + 1
            else:
                count = count - 1

            if count == 0:
                maxlen = max(maxlen, i + 1)
            if count not in dict1:
                dict1[count] = i
            else:
                maxlen = max(maxlen, i - (dict1.get(count)))
        return maxlen

