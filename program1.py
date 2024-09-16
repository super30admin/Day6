# Time complexity - O(N)
# Space complexity - O(1)
# Executed in leetcode - yes

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        running = 0
        hash_map = {}
        hash_map[0] = 1
        
        for elem in nums:
            running += elem
            if running - k in hash_map:
                count += hash_map[running - k]
                
            if running in hash_map:
                hash_map[running] += 1
            else:
                hash_map[running] = 1
            
        return count
                