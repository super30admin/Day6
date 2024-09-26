# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_len = 0
        rsum = 0
        arr_map = {0: -1}

        for index, num in enumerate(nums):
            if num == 0:
                rsum = rsum - 1
            else:
                rsum = rsum + 1
            if arr_map.has_key(rsum):
                max_len = max(max_len, (index - arr_map[rsum]))
            else:
                arr_map[rsum] = index
        return max_len
