# TC: O(N)
# SC: O(N)
# LeetCode: Y(https://leetcode.com/problems/contiguous-array)
# Approach: Brute force way to solve this problem is to consider each subarray, check for equal number of 0's and 1's, 
#           remember the maximum
#           Optimized approach is to have a running sum which increments if the element in array is 1, decrements if the element in the array is 0
#           Use a dictionary too store the first index where a runnning sum was seen.
#           If a running_sum is already seen then the subarray from its index to current index is a subarray with equal 0's and 1's


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:

        max_length, running_sum = 0, 0
        
        running_sums = {}
        
        # Loop through the given list
        for index, value in enumerate(nums):
            # Update running sum
            running_sum += value if value == 1 else -1
            
            # Case where entire subarray from 0 to current index has equal number of 0's and 1's
            if running_sum == 0:
                max_length = max(max_length, index + 1)
            # Case where a subaaray in the middle has equal number of 0's and 1's
            elif running_sum in running_sums:
                max_length = max(max_length, index - running_sums[running_sum])
            # No subarray with equal 0's and 1's found which ends at current index
            else:
                running_sums[running_sum] = index
                
        return max_length
        
