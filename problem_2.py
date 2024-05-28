# Time complexity O(n)
# Space complexity O(n)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if not nums:
            return -1
        r_sum = 0 
        max_val = 0 
        hash_map = {r_sum:-1} # {0, -1}
        for i, val in enumerate(nums):
            if val == 1:
                r_sum += 1 # r_sum = 0
            else:
                r_sum -= 1
            if r_sum in hash_map:
                max_val = max(max_val, i - hash_map[r_sum])
            else:
                hash_map[r_sum] = i # {0:1, -1:0,}
        return max_val

        
        