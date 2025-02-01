# Time Complexity : O(n) - n is length of nums
# Space Complexity : O(n) - As max size of dict would be n (all elements of nums are 1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

"""
We are trying to find all possible contiguous subarrays and then check
which subarray with equal 1s and 0s has the max len

When a subarray has equal number of 0s and 1s, if we consider 0 as -1, sum of that subarray would be 0
So, we have to find max len subarray with sum as 0

we will maintain a map of {sum : index of first encounter of that sum}

So, we will traverse the array, and
if sum up to that index has been encountered before (that means elements between these two equal sums have equal no. of 0s and 1s)
  compare the distance between that sum and current index with current max_len and update max_len if required
else add the sum up to current index to the map
"""

def findMaxLength(nums):
    """
    :type nums: List[int]
    :rtype: int
    """
    max_len = 0

    # this is for the case when he sub array starts from index 0
    # this is to say that we encountered sum 0 at index -1
    sum_index_map = {0: -1}
    s = 0
    for i in range(0, len(nums)):
        if nums[i] == 1:
            s = s + 1
        else:
            s = s - 1
        if s in sum_index_map:
            max_len = max(max_len, i - sum_index_map[s])
        else:
            sum_index_map[s] = i

    return max_len

