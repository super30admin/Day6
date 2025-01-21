"""

Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2

Time Complexity : O(N)
Space Complexity : O(N)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

"""

# Approach: used a hashmap to store the cumulative sum frequencies while iterating through the array.  
# For each element, computed the current cumulative sum and check if the difference (cursum - k) exists in the hashmap,  
# which indicates a subarray summing to k. then updated the result accordingly and store the cumulative sum count in the hashmap.

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:

        cursum = 0
        res = 0
        hmap = {0:1}

        for i in nums:
            cursum += i
            diff = cursum - k
 
            res += hmap.get(diff, 0)
            hmap[cursum] = 1 + hmap.get(cursum, 0)

        return res
