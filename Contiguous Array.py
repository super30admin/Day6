#Time= O(n)
#Space= O(n)
# Run on Leetcode: Yes

class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        00011110000"""
        summ = 0
        d = {}
        ans = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                summ-=1
            else:
                summ+=1
            if summ == 0:
                ans = i+1
            if summ in d:
                    ans = max(ans,i-d[summ])#3-1
            else:
                d[summ] = i
        return ans