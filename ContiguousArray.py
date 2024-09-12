class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        
        
        curr_sum = 0
        max_len = 0
        hashmap= {}
        hashmap[curr_sum] = -1
        
        for i in range(len(nums)):
            if nums[i] == 0:
                curr_sum -= 1
            else:
                curr_sum += 1
                
            if curr_sum not in hashmap:
                hashmap[curr_sum] = i
            else:
                max_len = max(max_len, i - hashmap[curr_sum])
                
        return max_len
    
    
        # Time Cemplexity: O(n)
        # Space Complexity: O(n)