# Time Complexity : O(n)
# Space Complexity : O(n) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Keep track of cumulative sum using a hashmap. If the cumulative
#sum - k in hashmap, increment the count for subarrays else continue
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        h = {}
        countofSubarrays = 0
        h[0] = 1
        cumSum = 0
        for i in nums:
            cumSum+=i
            value=cumSum-k
            if value in h:
                countofSubarrays+=h[value]
            if cumSum not in h:
                h[cumSum]= 0
            h[cumSum]+=1          
        return countofSubarrays
                
                