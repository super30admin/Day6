""""// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
"""




class Solution:
    def subarraySum(self, nums, k):
        d = {0: 1}
        rSum = 0
        result = 0
        for i in range(len(nums)):
            rSum += nums[i]
            if rSum - k in d:
                result += d[rSum - k]
            if rSum in d:
                d[rSum] += 1
            else:
                d[rSum] = 1
        return result

