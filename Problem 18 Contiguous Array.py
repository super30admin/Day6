# Did this code successfully run on Leetcode: Yes
# Time Complexity: O(n)
# Space Complexity: O(n) since mapper takes sum & sum can have n values.
# Logic: treat 0 as -1 & keep checking sum to be equal to 0. Store sum with index in a dic for cal max length.

class Solution:
    def findMaxLength(self, nums):
        mapper = {0: -1}
        sum = 0
        maxlen = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                sum += -1
            else:
                sum += 1
            if sum in mapper:
                maxlen = max(maxlen, i - mapper[sum])
            else:
                mapper[sum] = i
        return maxlen
