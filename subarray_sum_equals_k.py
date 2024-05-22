"""
Hashing-2

Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)

Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:
Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
 
Constraints:
1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 107

Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Your code here along with comments explaining your approach:
We're going to use hash map to store running sums and it's count. Base case would be for 0 sum the count will be 1 since we may find the sum right at the start.
First we iterate through nums, and add it to pre_sum and check if this pre_sum - k exists in hash_map if yes then we get this (pre_sum - k) count from hash_map and add it to
sub_arrays_count else we add pre_sum to hash map with a value of 1 for the pre_sum key.
"""

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if not nums or len(nums) == 0:
            return 0
        
        """
            key is pre_sum & value is count
            0 is the base case
        """

        hash_map = {
            0 : 1
        }
        pre_sum = 0
        subarrays_count = 0

        for num in nums:
            pre_sum += num
            if pre_sum - k in hash_map:
                subarrays_count += hash_map[pre_sum - k]
            
            hash_map[pre_sum] = hash_map.get(pre_sum, 0) + 1
        
        return subarrays_count
        