# TC:O(n)
# SC:O(n)
from collections import defaultdict
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        sum = 0
        hash_map = defaultdict(lambda:0)
        hash_map[0] = 1
        for i in range(len(nums)):
            sum += nums[i]
            if (sum - k) in hash_map:
                count += hash_map[sum-k]
            hash_map[sum] += 1
        return count