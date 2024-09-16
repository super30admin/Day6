# Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
# Go through the array and store the first occurence
"""
Time Complexity = O(n) because we traverse the array only once.
Space Complexity = O(n) for the map that we're creating to store the indices"""

class Solution:
    def findMaxLength(self, nums) -> int:
        count = 0
        max_length = 0
        table = {0: -1}
        for index, num in enumerate(nums):
            # If you encounter a 0, decrease the count variable
            if num == 0:
                count -= 1
            # If 1, then increase the count variable
            else:
                count += 1

            # If the element is already present, then update max_length
            if count in table:
                max_length = max(max_length, index - table[count])

            # If the element is not present, then insert it into the map
            else:
                table[count] = index

        return max_length