# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # done using rsum or cumilative sum pattern

        n = len(nums)
        count = 0
        current = 0

        # storing rsum values
        rsum = {0: -1}

        # increment if value is 1 and decrement count if value is 0
        for i in range(n):
            if nums[i] == 0:
                current = current - 1
            else:
                current = current + 1

            if current in rsum:
                # taking the maximum length of the balanced array
                # subtracting current index with the prev found index
                count = max(count, i-rsum[current])
            else:
                rsum[current] = i
        return count
