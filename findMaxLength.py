"""
Given a binary array nums, 
return the maximum length of a contiguous subarray with an equal number of 0 and 1.

Time Complexity: O(n)
Space Complexity: O(n)
"""


def findMaxLength(nums):
    prefix_sum = 0
    max_length = 0
    hm = {0: -1}

    for i in range(len(nums)):
        if nums[i] == 0:
            prefix_sum -= 1
        else:
            prefix_sum += 1

        if prefix_sum in hm:
            max_length = max(max_length, i - hm[prefix_sum])
        else:
            hm[prefix_sum] = i

    return max_length


print(findMaxLength([0, 1, 0]))
