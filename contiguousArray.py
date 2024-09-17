
"""
Time Complexity: O(n)
Space Complexity: O(n)
"""


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        map = {}
        map[0] = -1
        curSum = 0
        maxLen = 0

        for i in range(len(nums)):
            if(nums[i] == 0):
                curSum += -1
            else:
                curSum += 1
            if(curSum in map):
                maxLen = max(maxLen, i-map[curSum])
            else:
                map[curSum] = i

            return maxLen
