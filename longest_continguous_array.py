#Time complexity: O(n)
# Space complexity: O(n)
# Worked on leetcode
# The algorithm replaces all 0's with -1 and then calculates the contiguous sum of numbers in the array. It stores the sum of the numbers as the keys,
# and corresponding indices as values in the Hashmap.
# Everytime current sum reaches 0, the maximum length gets updated to 1. 
# increments the count.


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:

        Hashmap = {}
        maximum = 0
        current_sum = 0

        for i in range(len(nums)):
            if nums[i] == 0:
                current_sum -= 1
            else:
                current_sum += 1

            if current_sum == 0:
                maximum = i + 1

            if current_sum in Hashmap.keys():
                maximum = max(maximum, i - Hashmap[current_sum])
            else:
                Hashmap[current_sum] = i  # store the index

        return maximum