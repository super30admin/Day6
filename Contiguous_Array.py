# We use a hashmap to keep track of the cumulative count, treating 0s as -1s to balance out 1s and 0s. 
# For each element, we update the cumulative count and check if that count has been seen before; if so, 
# it means there exists a subarray with equal numbers of 0s and 1s between those two indices. We track the maximum length 
# of such subarrays as we iterate through the array.

# Time Complexity : O(n), where n is the length of nums, as we traverse the array only once.
# Space Complexity : O(n), for storing the cumulative counts in the hashmap.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

from typing import List

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        max_length = 0
        cumulative_count = 0
        count_map = {0: -1}  # Initialize with cumulative count 0 at index -1 for subarrays starting from index 0

        for i, num in enumerate(nums):
            # Treat 0 as -1 and 1 as +1 to balance the count
            cumulative_count += 1 if num == 1 else -1
            
            # Check if this cumulative count has been seen before
            if cumulative_count in count_map:
                # Calculate the length of the subarray between the first occurrence of this count and the current index
                max_length = max(max_length, i - count_map[cumulative_count])
            else:
                # Store the first occurrence of this cumulative count
                count_map[cumulative_count] = i
        
        return max_length
