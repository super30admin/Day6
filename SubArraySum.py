# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        rsum = 0
        count = 0
        nums_map = {0: 1}

        if len(nums) == 1 and nums[0] != k:
            return 0

        for num in nums:
            rsum = rsum + num
            diff = rsum - k

            if nums_map.has_key(diff):
                count = count + nums_map[diff]

            if nums_map.has_key(rsum):
                nums_map[rsum] = nums_map[rsum] + 1
            else:
                nums_map[rsum] = 1

        return count
