from collections import defaultdict
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        sum_map = defaultdict(int)
        sum_map[0] += 1
        result, run_sum = 0, 0
        
        for num in nums:                    # Iterate through all numbers in array
            run_sum += num                  # Update Running Sum
            complement = run_sum - k        # Compute Complement
            result += sum_map[complement]   # Add freq of complement [0 by default]
            sum_map[run_sum] += 1           # Increment freq of sum
            
        return result

### Complexity Analysis

# Time Complexity: O(N) --> Iterating through entire array once
# Space Complexity: O(N) --> HashMap to store sum