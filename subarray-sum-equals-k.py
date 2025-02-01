# Time Complexity : O(n) - n is length of nums
# Space Complexity : O(n) - as max number of distinct sums would be n
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

"""
We are trying to find all possible contiguous sub arrays and then check
which sub array's sum is k

We can avoid calculating sum for all possible sub arrays,
by storing {running sum : no of times it has been encountered} in a map
"""

def subarraySum(nums,k):
    count = 0
    # to store running sum and number of times we have seen that sum
    sum_count_map = {0: 1}
    running_sum = 0

    for i in range(0, len(nums)):
        running_sum += nums[i]
        if (running_sum - k) in sum_count_map:
            count += sum_count_map[running_sum - k]
        if running_sum in sum_count_map:
            sum_count_map[running_sum] = sum_count_map[running_sum] + 1
        else:
            sum_count_map[running_sum] = 1
    return count




