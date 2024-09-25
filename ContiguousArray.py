# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : N/A

# Your code here along with comments explaining your approach
class Solution:
    def findMaxLength(self, nums: list[int]) -> int:
        num_map = {0: -1}  # Initialize the map with rsum 0 at index -1
        max_length = 0
        rsum = 0

        for i in range(len(nums)):
            # Adjust rsum based on whether the current number is 0 or 1
            if nums[i] == 0:
                rsum -= 1  # Treat 0 as -1
            else:
                rsum += 1  # Treat 1 as +1

            # Check if rsum has been seen before
            if rsum in num_map:
                max_length = max(max_length, i - num_map[rsum])  # Update max length
            else:
                num_map[rsum] = i  # Store the index for this rsum

        return max_length  # Return the maximum length found