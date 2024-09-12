"""
Approach

1. This problem is similar to find the number of subarrays whose sum equals k. in this case k is zero
2. we find the cumulative Sum at each index. we add +1 if we encounter 0 and add -1 if we encounter 1 to the cumulative sum
3. we check if the cumulative sum is present in our map, if it is present then we add the cumulative sum at each index in our map with key as cumulative sum and value as that perticular index
4. if we find the cumulative sum in our map we return the max index 

"""


# Time Complexity : O(n) 
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes	
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        map1 = {}
        maxCount =0
        cumulativeSum =0
        for i in range(len(nums)):
            if nums[i]==0:
                cumulativeSum+=1
            else:
                cumulativeSum-=1
            if cumulativeSum == 0:
                maxCount = i+1
            if not cumulativeSum in map1:
                map1[cumulativeSum]=i
            else:
                maxCount = max(maxCount,i-map1[cumulativeSum])
        return maxCount
