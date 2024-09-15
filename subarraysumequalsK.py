"""
https://leetcode.com/problems/subarray-sum-equals-k/
TC = O(N)
SC = O(n)
similar approach to contiguous subarray
"""


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        sum = 0
        sumOccurenceMap = {0: 1}

        for i in nums:
            sum += i

            if sum - k in sumOccurenceMap:
                count += sumOccurenceMap[sum - k]
            sumOccurenceMap[sum] = sumOccurenceMap.get(sum, 0) + 1
        return count

