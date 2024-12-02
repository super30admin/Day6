# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


#maintaining current sum and saving if current - pres element is k
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if len(nums) == 0:
            return 0
        a = {0: 1}
        currVal = 0
        count = 0
        for i in range(len(nums)):
            currVal += nums[i]
            if currVal - k in a:
                count += a[currVal - k]
            if currVal in a:
                a[currVal] += 1
            else:
                a[currVal] = 1
        return count