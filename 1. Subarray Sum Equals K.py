"""
Time Complexity = O(n) because we traverse the array only once.
Space Complexity = O(n) for the map"""


class Solution:
    def subarraySum(self, nums, k: int) -> int:
        result = 0
        running_sum = 0
        table = {}
        # Initializing the table
        table[0] = 1

        # Traversing the array
        for num in nums:
            # Calculating running sum
            running_sum += num

            # If r_sum - k is already in the table, then add its value to the result
            if (running_sum - k) in table:
                result += table[running_sum - k]

            # If already present, increment the count
            if running_sum in table:
                table[running_sum] += 1
            # If not present, initialize it to 1
            else:
                table[running_sum] = 1

        return result