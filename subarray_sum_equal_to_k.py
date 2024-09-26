"""
Time complexity :- O(n)
Space compleixty :- O(n)
"""
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hash_map = {0 : 1}
        prefix_sum = 0
        count = 0
        for i in nums:
            prefix_sum = prefix_sum+i
            if prefix_sum - k in hash_map:
                count =count + hash_map[prefix_sum - k]
            hash_map[prefix_sum] = hash_map.get(prefix_sum, 0) + 1
        return count
