# Time complexity - O(N)
# Space complexity - O(N)
# Executed in leetcode - yes

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        count = 0
        maximum = 0
        hash_map = {}
        hash_map[0] = -1
        
        for i in range(0, len(nums)):
            if nums[i] == 0:
                count = count - 1
            else:
                count = count + 1
                
            if count in hash_map:
                maximum = max(maximum, i - hash_map[count])
            else:
                hash_map[count] = i
            
        return maximum