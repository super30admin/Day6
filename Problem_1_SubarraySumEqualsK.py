## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)

# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes.
# Any problem you faced while coding this : Understanding the necessity for RSUM-K check and 
# RSUM again individually. 

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        #Optimal solution
        rsum=0
        hmap={0:1} #THis is done inorder to handle the cases where the TARGET already exists as SUM
        ct=0
        for i in range(len(nums)):
            rsum+=nums[i]
            if (rsum-k) in hmap:  #We need to check for the difference (Z-X) as we call it in Running SUM problems
                ct+=hmap[rsum-k]  #Get the no.of occurences not just increment
            if rsum in hmap:
                hmap[rsum]+=1     #Increment the no.of occurences if we find the RSUM already
            else:
                hmap[rsum]=1
            
        return ct