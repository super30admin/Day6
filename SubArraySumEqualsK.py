# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : N/A

# Your code here along with comments explaining your approach
class Solution:
    def subarraySum(self, nums: list[int], k: int) -> int:
        num_map = {0: 1}  # Initialize the map with 0 sum occurring once
        count = 0
        rSum = 0

        for num in nums:
            rSum += num  # Update the running sum
            cmp = rSum - k  # Calculate the complement

            # Check if the complement exists in the map
            if cmp in num_map:
                count += num_map[cmp]  # Add the count of how many times cmp has been seen

            # Update the map with the current rSum
            num_map[rSum] = num_map.get(rSum, 0) + 1

        return count  # Return the total count
