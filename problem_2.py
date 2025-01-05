"""
problem_2: Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
Time Complexity: O(n)
Space Complexity: O(n)
Approach: Use a hashmap to store the sum and the index of the sum. Iterate through the array and update the sum.
If the sum is already present in the hashmap, then calculate the length and update the max length.
If the sum is not present in the hashmap, then add the sum to the hashmap.
Return the max length.
"""

from typing import List


def findMaxLength(nums: List[int]) -> int:
    if not nums or len(nums) == 0 or len(nums) == 1:
        return 0

    max_len = 0
    r_sum = 0
    hmap = {0: -1}

    for i in range(len(nums)):
        if nums[i] == 0:
            r_sum = r_sum - 1
        else:
            r_sum = r_sum + 1

        if r_sum in hmap:
            max_len = max(max_len, i - hmap[r_sum])
        else:
            hmap[r_sum] = i

    return max_len

findMaxLength([0, 1, 0, 0, 1, 0, 1, 1])  # Output: 8
