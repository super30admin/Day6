# Time Complexity : O(n)
# Space Complexity : O(n)
# This function calculates the number of subarrays that sum to a given value k using a running sum and a hash map to track the frequency of running sums.
# For each element in the array, it updates the running sum and checks if the difference (rsum - k) exists in the hash map, which indicates a subarray summing to k.
# It updates the count accordingly and records the current running sum in the hash map. The function returns the total count of such subarrays.
class Solution:
    def subarraySum(self, nums: list[int], k: int) -> int:
        if nums is None or len(nums) == 0: # Base case
            return 0
        
        count = 0
        rsum = 0
        sum_map = {rsum: 1} # Default value for the hashmap
        
        for num in nums:
            rsum += num # Calculate the running sum at this index
            if rsum - k in sum_map: # If the difference is already recorded in map
                count += sum_map[rsum - k] # Update the count
            sum_map[rsum] = sum_map.get(rsum, 0) + 1 # Add or update the value for the current rsum
        return count

# Example 1
solution = Solution()
nums = [1, 1, 1]
k = 2
print(solution.subarraySum(nums, k))  # Output: 2

# Example 2
nums = [1, 2, 3]
k = 3
print(solution.subarraySum(nums, k))  # Output: 2

# Example 3
nums = [5, 7, 0, 2, 3, 4, 5]
k = 7
print(solution.subarraySum(nums, k))  # Output: 3

# Example 4
nums = [3, 4, 7, 0, 2, 3, -2, -1, 3, 4, 7, 0, 1]
k = 7
print(solution.subarraySum(nums, k))  # Output: 7