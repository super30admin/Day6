# Time Complexity = o(n) Space Complexity = O(n)

class Solution:
    def findMaxLength(self, nums: list[int]) -> int:
        if nums is None or len(nums) in [0, 1]:  # edge cases and null
            return 0

        max_len = 0
        hash_map = {}
        hash_map[0] = -1  # r_sum : earliest index
        r_sum = 0

        for i in range(0, len(nums)):
            if nums[i] == 0:
                r_sum -= 1
            else:
                r_sum += 1
            if r_sum in hash_map:
                max_len = max(max_len, i - hash_map[r_sum])
            else:
                hash_map[r_sum] = i
            i += 1

        return max_len
