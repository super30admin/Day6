"""
Approach

1. In an array if we have a sum x till an index i and a sum of x-k till an index i-3 then the sum of the elements between i-3 and i will always be k.
2. we use this idea of cumulative sum and save the cumulative sum at each point and check if we had a cumulative sum of x-k in our map
3. we update the global count if we find x-k in our map 

"""


# Time Complexity : O(n) 
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes	
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        map1 = {}
        cumulativeSum=0
        count = 0
        map1[0]=1
        for i in range(len(nums)):
            cumulativeSum  = cumulativeSum+nums[i]
            if (cumulativeSum-k) in map1:
                count = count + map1[cumulativeSum-k]
            if cumulativeSum in map1:
                map1[cumulativeSum]+=1
            else:
                map1[cumulativeSum]=1
            
        return count
        
