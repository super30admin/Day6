# Time Complexity : O(n), where n is the length of the input array
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        rsum = 0

        indices = dict()
        indices[0] = -1

        max_len = 0

        for i, num in enumerate(nums):
            rsum += 1 if num == 1 else -1

            if rsum in indices:
                max_len = max(max_len, i - indices[rsum])

            else:
                indices[rsum] = i

        return max_len
