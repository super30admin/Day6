"""
Problem2 (https://leetcode.com/problems/contiguous-array/)
Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
Example 1:
Input: [0,1] Output: 2 Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1. Example 2:
Input: [0,1,0] Output: 2 Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1. Note: The length of the given binary array will not exceed 50,000.

Challenges: Working on it. Few test cases passed.
Time complexity: O(n) - linear
Space complexity: O(n) - linear
Comments: I am using a dictionary (similar to a hashmap) to record the initial index. When there is a  zero, 1 is subtracted from
x, else, 1 is added. For each value  of x, the maximum value is calculated.
"""

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:

        x = 0
        dict = {0:-1} 
        max_value = 0

        for i in range(len(nums)):
            if nums[i] == 0:
                x -= 1
            else:
                x += 1
        
        if x in dict:
            max_value = max(max_value, i-dict[x])
        else: 
            dict[x] = i
    
        return max_value
