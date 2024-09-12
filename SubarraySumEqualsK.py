# Time Complexity : O(N)
# Space Complexity : O(N)

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:

        hashmap = {0:1}
        result = 0
        total = 0

        for i in range(len(nums)):
            total += nums[i]

            if (total-k) in hashmap:
                result += hashmap[total - k]

            if total not in hashmap:
                hashmap[total] = 1
            else:
                hashmap[total] += 1
                
        return result