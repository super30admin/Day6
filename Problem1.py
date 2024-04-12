# Hashing-2
## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)

#Approach
# Initialise hashmap with running_sum 0 and count 1. 
# Calculate the running sum of the elements. If the running_sum-k is present in hmap, add the corresponding value(count) to the total_subarray count
# If running_sum is present in the hashmap, increment the count and if it is not present append the running_sum(key) and value(1) to hashmap. Return total_subarray count


# Time Complexity: O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        rSum = 0
        total_subarray = 0
        hmap = {0:1}

        for i in range(len(nums)):
            rSum += nums[i]
            if rSum-k in hmap:
                total_subarray += hmap[rSum-k]
            if rSum in hmap:
                hmap[rSum] += 1
            else:
                hmap[rSum] = 1
        
        return total_subarray