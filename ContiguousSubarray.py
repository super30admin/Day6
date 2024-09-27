'''
Time Complexity: O(n) becoz we are ooping through n elements
Space Complexity: O(n) becoz we are storing in hashmap
Leetcode: Success!
Problems: I little with the concept but got the hang of it. Made a silly mistake tho.

'''

class Solution:
    def findMaxLength(self, nums) -> int:
        # define a hashmap -> dictionary
        hashMap = {}
        # initialize it with 0: -1
        hashMap[0] = -1
        #initialize currSum = 0 and Max  = 0
        currSum = 0
        Max = 0
        lnum = len(nums)
        
        #travervse the list nums 
        for i in range(lnum):
            # check if the the value at index i is 0 if yes increament currSum by 1 else decrement by 1
            if nums[i]==0:
                currSum +=1
            else:
                currSum -=1
            # print("currSum: ",currSum)
            # check if the currSum is in the hashmap is yes then check for the max value between the current Max and the value at the present key hashMap[currSum]
            if currSum in hashMap:
                print("yes")
                Max = max(Max,(i - hashMap[currSum]))
            # otherwise add the key and value pair to hashmap
            else:
                hashMap[currSum]= i
        # print(hashMap)
        # return the Max value
        return Max


nums = [1,0,1,0,1,1,1,1,0,0,1,0,1]
#nums = [0,1]
#nums = [0,1,0]
nums = [0,0,1,0,0,0,1,1]
nums = [0,1,0]
s = Solution()
ls = s.findMaxLength(nums)
print("Length of the longest sub array: ",ls)
