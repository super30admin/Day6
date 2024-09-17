##Time Complexity : O(n)
##Space Complexity : O(n)
##Did this code successfully run on Leetcode : Yes

class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        d = {0: -1}
        count = answer = 0
        delta = {1: -1, 0: 1}
        for i in range(len(nums)):
            count += delta.get(nums[i], 0)
            if count in d:
                answer = max(answer, i - d[count])
            else:
                d[count] = i
        return answer
        