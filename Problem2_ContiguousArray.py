# Time Complexity: O(n), where n is length of nums
# Space Complexity: O(n)
# Did this code successfully run on Leetcode: Yes

# Solution:

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if not nums or len(nums) == 0:
            return 0

        # Dictionary to store running sum and its start index
        rmap = dict()
        rmap[0] = -1

        rsum = maxlen = 0

        for i in range(len(nums)):
            rsum = rsum + 1 if nums[i] == 1 else rsum - 1

            # whenever the same rsum is found, compute the length of that subarray and update max len
            if rsum in rmap:
                maxlen = max(maxlen, i - rmap[rsum])
            else:
                rmap[rsum] = i

        return maxlen




