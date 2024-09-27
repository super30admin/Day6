# Time Complexity O(n)
# Space Complexity O(n). HashMap size
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hash_map = {}
        hash_map[0] = 1
        counter = 0
        _sum = 0
        for i in range(len(nums)):
            _sum += nums[i]
            dummy = _sum - k
            if dummy in hash_map:
                counter += hash_map[dummy]
            if _sum not in hash_map:
                hash_map[_sum] = 1
            else:
                hash_map[_sum] = hash_map[_sum] + 1
        return counter