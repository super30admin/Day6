class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        index_map = {0:-1}
        run_sum, result = 0, 0
        
        # Iterate through given array
        for index, num in enumerate(nums):
            
            # Increment running sum by 1 when we encounter 0; decrement by 1 for 1   
            if num:
                run_sum += 1
            else:
                run_sum -= 1
            
            # If same sum previously occurred, compute the difference in index and cache the max
            if run_sum in index_map:
                result = max(result, index - index_map[run_sum])
                
            # Else, add the sum and its corresponding index
            else: 
                index_map[run_sum] = index
                
        return result


### Complexity Analysis

# Time Complexity: O(N) --> Iterating through given array once
# Space Complexity: O(N) --> Space occupied by hashmap
