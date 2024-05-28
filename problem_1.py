# Time complexity O(n)
# Space Complexity O(n)
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        r_sum = 0 
        hash_map = {r_sum:1}
        count =  0
        for val in nums:
            r_sum = r_sum + val
            if r_sum - k in hash_map:
                count = count + hash_map[r_sum - k]
            hash_map[r_sum] = hash_map.get(r_sum, 0) + 1
        return count  
            
            
        