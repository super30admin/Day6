# Time Complexity: O(n)
# Space Complexity: O(n)

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hash_map = {}
        length = 0
        running_sum = 0
        hash_map[0] = -1 
        for idx in range(0,len(nums)):
            if nums[idx] == 1:
                running_sum += 1
            else: running_sum -= 1
            
            if running_sum in hash_map:
                diff = idx - hash_map[running_sum]
                length = max(length, diff)
            else:
                hash_map[running_sum] = idx
                
        return length