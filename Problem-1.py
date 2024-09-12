"""
## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)
Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

Example 1:

Input:nums = [1,1,1], k = 2

Output: 2

Note:

The length of the array is in range [1, 20,000].
The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No, Shazmaan explained really well

"""
# brute force
def subarray_sum(nums,k):
    count=0
    for start in range(len(nums)):
        for end in range(1,len(nums)+1):
            sum = 0
            for i in range(start,end):
                sum = sum + nums[i]
            if sum == k :
                count += 1
    return count

#hashmap
def subarray_sum2(nums,k):
    running_sum = 0                    # initialize running sum
    final_count = 0                    # declare final count to keep track of sub arrays
    dic = {}                           # hashmap/dic  - to store {running_sum : count}
    dic[0] = 1                         # add {0:1} to hashmap means running_sum = 0 and count is 1
    for i in range(len(nums)):         # loop through numbers
        running_sum += nums[i]         # add number to running sum
        if running_sum - k in dic:     # check if running_sum - target is in dic of yes then add the value of count to final count
            final_count = final_count + dic[running_sum - k]

        if running_sum not in dic:   # if running_sum not in dic then add it and value as 1
            dic[running_sum] = 1
        else:
            dic[running_sum] += 1    # if running_sum not in dic then  value by 1
    return final_count








print(subarray_sum(nums = [1,2,3], k = 3))
print(subarray_sum2(nums = [1,2,3], k = 3))


