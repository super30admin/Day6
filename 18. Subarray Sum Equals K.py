# Time Complexity: O(n)
# Space Complexity: O(n)

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hash_map = {}
        running_sum = 0
        hash_map[0] = 1
        count = 0
        for i in nums:
            running_sum = running_sum + i
            diff = running_sum - k
            if diff in hash_map:
                count += hash_map[diff]
            if running_sum in hash_map:
                hash_map[running_sum] += 1
            else:
                hash_map[running_sum] = 1
        return count
            