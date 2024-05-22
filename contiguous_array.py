"""
Hashing-2

Problem2 (https://leetcode.com/problems/contiguous-array/)

Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

Example 1:

Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
Example 2:

Input: nums = [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
 
Constraints:
1 <= nums.length <= 105
nums[i] is either 0 or 1.

Time Complexity : O(n) (brute force - O(n^3) i.e., O(n^2) to calculate all sub arrays and another loop to calculate the max length)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Your code here along with comments explaining your approach:
Approach is we're going to use hash map to keep track of the running sum and it's index. The base condition will be for 0 sum, index is -1.
We iterate through the nums, add -1 to pre_sum if num is 0 else we add +1. Now we check if that sum already exists in hash_map if yes then we 
take its value and add it to the max_len else we create it in hash_map with initial value of 1. 
"""

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if not nums or len(nums) == 0:
            return 0
                
        """
            base condition at index -1 for sum 0
            key is sum, value is index
        """
        hash_map = {
            0: -1
        }
        pre_sum = 0
        max_len = 0

        for idx,num in enumerate(nums):
            """
            if num == 1:
                pre_sum += 1
            else:
                pre_sum -= 1
            """
            pre_sum += -1 if num == 0 else num
            if pre_sum in hash_map:
                max_len = max(max_len, idx - hash_map[pre_sum])
            else:
                hash_map[pre_sum] = idx

        return max_len
