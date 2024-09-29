# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if nums == None or len(nums) <= 1:
            return 0
        map = {}
        map[0] = -1
        maxLen = 0
        rSum = 0

        for i in range(len(nums)):
            if nums[i] == 0:
                rSum -= 1
            else:
                rSum += 1

            if rSum in map:
                maxLen = max(maxLen, i - map[rSum])
            else:
                map[rSum] = i
        return maxLen

        