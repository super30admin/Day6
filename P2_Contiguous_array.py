# Time Complexity: O(n)
# Space Complexity: O(n)
# Is this problem on Leetcode: Yes
# Approach to solve the problem:

# Find the longest contiguous array:
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        sum_map = {0:-1}                    # dictionary to keep sum 
        max_len = 0                         # to store the maximum length of contiguous array
        distance = 0                        
        partial_sum = 0
        for i, num in enumerate(nums):
            if num == 1:
                partial_sum += 1            # If we see 1 we are going to add partial_sum
            else:
                partial_sum -= 1            # If we see 0 we are going to subs partial_sum
        
            if partial_sum in sum_map:                      # If the value already in sum_map
                distance = i - sum_map[partial_sum]         # Calculate the distance
                max_len = max(max_len, distance)            # Pick the maximum dist betn two
            else:
                sum_map[partial_sum] = i                    # If value not in sum_map

        return max_len                                      # Return the maximum length

