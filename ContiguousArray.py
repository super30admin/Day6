# Time Complexity: O(n), where n is the length of the input array `nums`.
# Space Complexity: O(n), due to the hash map storing running sums and their indices.
# Approach: Used a hash map to track running sums and their first occurrence to find the maximum subarray with equal 0s and 1s in O(n) time.

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if nums is None:
            return False
        
        # Use a dictionary to map running sums to their indices
        map = {0: -1}  # Initialize with 0 mapped to -1
        rsum = 0
        Max = 0  # Track the maximum length of a valid subarray

        for i in range(len(nums)):
            # Update running sum
            if nums[i] == 0:
                rsum -= 1
            else:
                rsum += 1
            
            # Check if the running sum has been seen before
            if rsum in map:
                Max = max(Max, i - map[rsum])  # Update maximum length
            else:
                map[rsum] = i  # Store the first occurrence of the running sum

        return Max
