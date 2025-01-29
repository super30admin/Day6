# 525. Contiguous Array: https://leetcode.com/problems/contiguous-array/description/

# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this :NO


# Your code here along with comments explaining your approach
# we calculate prefix sum of the array, if 0 is found minus from ps else add 1 to it
# if the ps is found in hm then then we take the max of the already present length as ans and that 
# index minus the first occurrence os ps from the hm. if ps not found in hm then make an entry of it.


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        ps = 0
        hm = {0: -1} # primary entry of 0 as -1
        ans = 0
        for i in range(len(nums)):
            if(nums[i] == 0):
                ps-=1
            else:
                ps+=1
            
            if(ps in hm):
                ans = max(ans, i - hm[ps])
            else:
                hm[ps] = i
        
        return ans
        
