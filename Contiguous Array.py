class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        #Time Complexity: O(n)
        #Space Complexity: O(n)
        #where, n is the length of nums
        
        total = 0
        max_len = 0
        
        hash_map = {0: -1}
        
        for i in range(len(nums)):
            total += (1 if nums[i] == 1 else -1)
            
            if total in hash_map:
                max_len = max(max_len, i - hash_map[total])
            else:
                hash_map[total] = i
                
        return max_len