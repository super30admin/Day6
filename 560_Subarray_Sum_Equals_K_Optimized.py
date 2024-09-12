# Time Complexity : O(n) [n = number of elements in input list]
# 
# Space Complexity : O(n) [n+1 to be precise -> size of cumaltive_sum_map]
# 
# Did this code successfully run on Leetcode : Yes
# 
# Any problem you faced while coding this : No
# 
# Problem Approach
# 1. Store the cumaltive sum in a map with sum as the key and number of times the same sum is encountered as value. 
# 2. We check if sum -k exist in the map. Here sum denotes the cumalative sum at current index. If the value does exists, then the result is cumalative sum at the start index of subarray. 
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        cumalative_map = {0:1}
        s = 0
        for num in nums:
            s+=num
            if s-k in cumalative_map:
                count+= cumalative_map[s-k]
            cumalative_map[s] = cumalative_map.get(s, 0) + 1
        return count