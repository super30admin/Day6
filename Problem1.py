# Time Complexity = o(n), Space Complexity = o(n)

class Solution:
    def subarraySum(self, nums: list[int], k: int) -> int:
        if nums is None or len(nums) == 0:
            return -1
        hash_map = {}
        hash_map[0] = 1

        count = 0
        r_sum = 0

        for i in range(0, len(nums)):
            r_sum += nums[i]
            cmp = r_sum - k
            if cmp in hash_map:
                count += hash_map[cmp]
            hash_map[r_sum] = hash_map[r_sum] + 1 if hash_map.get(r_sum) else 1
            i += 1

        return count


