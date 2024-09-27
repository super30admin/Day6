class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        #Time Complexity: O(n)
        #Space Complexity: O(n)
        #where, n is the length of nums
        
        total = 0
        count = 0
        
        hash_map = {0: 1}
        
        for num in nums:
            total += num
            count += hash_map.get(total - k, 0)
            hash_map[total] = hash_map.get(total, 0) + 1
            
        return count