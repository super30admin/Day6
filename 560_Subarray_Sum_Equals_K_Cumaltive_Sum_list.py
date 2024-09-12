# Time Complexity : O(n*n) [n = number of elements in input list]
# 
# Space Complexity : O(n)
# 
# Did this code successfully run on Leetcode : Partially(TLE)
# 
# Any problem you faced while coding this : No
# 
# Problem Approach:
# 1. create an cumalative_sum array list with the cumalative sum at each index
# 2. The cumaltive sum difference between any two indexex corresponds the sum of elements between those indexes
# 3. Whenever the cumaltive sum difference equates to k, the count is incremented
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        cumalative_sum = [0 for i in range(len(nums)+1)]
        
        for i, num in enumerate(nums):
            cumalative_sum[i+1] = cumalative_sum[i] + num
        
        for i in range(len(nums)+1):
            for j in range(i+1, len(nums)+1):
                if cumalative_sum[j] - cumalative_sum[i] == k:
                    count+=1
        return count