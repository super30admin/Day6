#Time Complexity: O(n)
#Space Complexity: O(n)
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        currSum, res = 0, 0
        prevSum = {0:1} #if we first obtain a curSum of k, the prefix sum we want to subtract is 0, but actually there is no prefix yet. So we have to set prefix sum 0 as 1 in the beginning.
        
        for n in nums:
            currSum += n
            rem = currSum - k
            res += prevSum.get(rem, 0)
            prevSum[currSum] = prevSum.get(currSum,0) + 1
        
        return res