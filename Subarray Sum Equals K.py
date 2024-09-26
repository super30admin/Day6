class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        maximum = 0
        count = 0
        
        subArray = { 0 : 1 }
        
        for num in nums:
            print("num is " + str(num) + "\n")
            count += num
            print("count is " + str(count) + "\n")
            compliment = count - k
            print("compliment is " + str(compliment) + "\n")
            if(compliment in subArray):
                maximum += subArray[compliment]
                print("maximum is " + str(maximum) + "\n")
            if(count in subArray):
                subArray[count] += 1
                for x in subArray.keys():
                    print("subArray is" + "[" + str(x) + "," + str(subArray[x]) + "]")
            else:
                subArray[count] = 1
                for x in subArray.keys():
                    print("subArray is" + "[" + str(x) + "," + str(subArray[x]) + "]")
        return maximum
