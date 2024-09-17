# Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)
# Time complexity: O(n)
# Space complexity: O(n)
# Approach: We store running sum and its count, and we calculate compliment every time, if it is already in hashmap, we increment count. Return count in the end.

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if not nums:
            return 0
        rsum = 0
        count = 0
        dic = {}
        dic[0] = 1
        for i in range(len(nums)):
            rsum += nums[i]
            compliment = rsum - k
            if compliment in dic.keys():
                count += dic[compliment]
            if rsum not in dic.keys():
                dic[rsum] = 1
            else:
                dic[rsum] += 1
        return count