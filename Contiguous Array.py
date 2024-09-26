class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        addition = 0
        count = 0

        hMap = {}
        
        for i in range(0, len(nums)):
            if (nums[i] == 0):
                addition = addition + 1
            else:
                addition = addition - 1 
                
            if(addition == 0):
                count = i + 1
                
            if(addition not in hMap):
                hMap[addition] = i
            else:
                count = max(count, i - hMap[addition] )
                
        return count
