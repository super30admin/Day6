"""
## Problem2 (https://leetcode.com/problems/contiguous-array/)
Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

Example 1:

Input: [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
Example 2:

Input: [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
Note: The length of the given binary array will not exceed 50,000.

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No, Shazmaan explained really well

"""

def Contiguous(nums):
    dic = {}
    max_count = 0
    count=0
    dic[0] = -1
    running_count = 0
    for i in range(len(nums)):
        if nums[i] == 0:
            running_count -= 1
        else:
            running_count += 1
        if running_count not in dic:
            dic[running_count] = i
        else:
            count = i - dic[running_count]
            max_count = max(count,max_count)

    return max_count


print(Contiguous([0,1,1,0,1,1,1,0]))




