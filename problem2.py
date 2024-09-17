"""
time: O(n)
space: O(n)
Leet: Accepted
Problems: None. Solution discussed in session
"""

class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        d = {}
        score = 0
        max_len = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                score -= 1
            else:
                score += 1
            if score == 0:
                max_len = i+1
            elif score not in d:
                d[score] = i
            else:
                max_len = max(max_len, i-d[score])
        return max_len
