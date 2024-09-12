# TimeComplexity: O(n)
# Space Complexity:O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: no
class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        rsum = 0
        ansMap = {}
        ansMap[0] = -1
        count = 0
        
        for i in range(len(nums)):
            if(nums[i] == 0):
                rsum -=1
            else:
                rsum +=1
            #Check if index is balance 
            if(ansMap.has_key(rsum)):
                count = max(count, i- ansMap[rsum])
            else:
                ansMap[rsum] = i
        return count
