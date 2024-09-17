## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)

# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode :Yes. Executed with 240ms
# // Any problem you faced while coding this : No problem, but unable to understand how to lessen the execution time in this case. I have already used the most optimal solution.


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if not nums:
            return 0
        rsum = 0
        count = 0
        rsumFreq = {0:1}
        for i in nums:
            rsum += i
            if(rsum-k in rsumFreq):
                count = count + rsumFreq[rsum-k]
            rsumFreq[rsum] = rsumFreq.get(rsum,0) + 1
        return count
                