# Time Complexity : O(n)
# Space Complexity : O(n)
# This function finds the maximum length of a contiguous subarray with an equal number of 0s and 1s by using a running sum (rsum) that increments for 1s and decrements for 0s. It uses a dictionary to track the first occurrence of each running sum, allowing it to compute subarray lengths efficiently. If a running sum is seen again, it means the subarray between the first occurrence and the current index has an equal number of 0s and 1s. The function returns the maximum length of such subarrays.
class Solution:
    def findMaxLength(self, nums: list[int]) -> int:
        if nums is None or len(nums) == 0: # Base case
            return 0
        
        rsum = 0 # Variable that maintains the running sum for the array
        max_length = 0
        index_map = {rsum: -1} # Dictionary that maintains the mapping for rsum to the index
        
        for i in range(len(nums)):
            if nums[i] == 1:
                rsum += 1 # Add 1 to rsum if the element is 1
            else:
                rsum -= 1 # Subtract 1 if the element is 0
            
            if rsum in index_map: # If rsum is already present in dictionary
                max_length = max(max_length, i - index_map[rsum]) # Update the max length of contiguous subarray
            else:
                index_map[rsum] = i # Add a new entry
        
        return max_length

# Example 1
solution = Solution()
nums = [0, 1, 0]
print(solution.findMaxLength(nums))  # Output: 2

# Example 2
nums = [0, 1]
print(solution.findMaxLength(nums))  # Output: 2

# Example 3
nums = [1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1]
print(solution.findMaxLength(nums))  # Output: 8