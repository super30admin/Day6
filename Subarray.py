
# We use a hashmap to keep track of the cumulative sum up to each index and how many times each sum has appeared. 
# For each element in nums, we calculate the cumulative sum and check if (cumulative_sum - k) exists in the hashmap, 
# which would indicate that a subarray with sum k exists up to that index. By summing up the counts of all such occurrences, 
# we get the total number of subarrays that equal k.

# Time Complexity : O(n), where n is the length of nums, because we traverse the array only once.
# Space Complexity : O(n), for storing the cumulative sum counts in the hashmap.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

from typing import List

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        cumulative_sum = 0
        cumulative_sum_counts = {0: 1}  # Initialize with 0 sum for subarrays that start from index 0

        for num in nums:
            cumulative_sum += num  # Update cumulative sum
            
            # Check if there's a cumulative sum that satisfies the condition for sum k
            if cumulative_sum - k in cumulative_sum_counts:
                count += cumulative_sum_counts[cumulative_sum - k]
            
            # Add or update the count of the current cumulative sum in the hashmap
            cumulative_sum_counts[cumulative_sum] = cumulative_sum_counts.get(cumulative_sum, 0) + 1
        
        return count
