# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : No
# Any problem you faced while coding this :


# Your code here along with comments explaining your approach


class Solution:

    def subarraySum(self, nums: List[int], k: int) -> int:

        if not nums:
            return 0

        if len(nums) == 1:
            if nums[0] == k:
                return 1
            else:
                return 0

        for i in range(1, len(nums)):
            nums[i] += nums[i - 1]

        res1 = 0

        for n in nums:
            if n == k:
                res1 += 1

        res2 = 0

        d = dict()

        for n in nums:
            d[n - k] = n

        for n in nums:
            if n in d:
                res2 += 1

        return res1 + res2
