# Time Complexity : O(n*n) [n = number of elements in input list]
# 
# Space Complexity : O(1)
# 
# Did this code successfully run on Leetcode : Partially(TLE)
# 
# Any problem you faced while coding this : No
# 
# Problem Approach:
# 1. Iterate over all the index and find the sum for all possible consicutive subarray starting from that index
# 2. Whenever the sum equates to k, the count is incremented
# 3. Additionally, the count is also incremented if the value at index is equal to k
 class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        for i in range(len(nums)):
            s = nums[i]
            if s == k:
                count+=1
            for j in range(i+1, len(nums)):
                s+= nums[j]
                if s == k:
                    count+=1
        return count