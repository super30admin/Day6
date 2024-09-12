class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        hashmap = {}
        
        curr_sum = 0
        sub_arr = 0
        
        for num in nums:
            curr_sum += num
            
            if curr_sum == k:
                sub_arr += 1
                
            if curr_sum - k in hashmap:
                sub_arr += hashmap[curr_sum - k]
            
            if curr_sum not in hashmap:
                hashmap[curr_sum] = 1
            else:
                hashmap[curr_sum] += 1
            
            
                
        return sub_arr
    
    # Time complexity: O(n) for iterting through all the elements in nums
    # Space Complexity: O(n) because of storing in hashmap
            
                
            