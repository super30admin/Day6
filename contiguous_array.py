# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
#
#
# // Your code here along with comments explaining your approach:
# Create a hashmap where running sum of the array will be the keys, and the values will be the index in the array corresponding to the running sum.
# If the running sum is already present in the hashmap, this means that there would be a 0 running sum in the hashmap,
# so update the maximum length of the contiguous array with new length, if new length is greater than previous value.


def findMaxLength(nums):

    if len(nums) == 0:
        return 0

    hashmap = {}
    hashmap[0] = -1
    max_len = 0

    running_sum = 0

    for idx, element in enumerate(nums):
        if element == 0:
            running_sum -= 1
        else:
            running_sum += 1

        if running_sum == 0:
            max_len = idx + 1

        if running_sum in hashmap.keys():
            max_len = max(max_len, idx - hashmap[running_sum])

        else:
            hashmap[running_sum] = idx

    return max_len


