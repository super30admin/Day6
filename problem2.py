# Time Complexity : O(N), 
# Space Complexity :O(N)

# Did this code successfully run on Leetcode : 
# YEs

# Any problem you faced while coding this : 

# Your code here along with comments explaining your approach

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if nums==None and len(nums)==0 : 
            return 0
        hashm = {}
        hashm[0] = -1
        count = 0
        maxv = 0
        # each is stored in dictionary with value increment or decrement
        for i in range (len(nums)):
            if nums[i] == 0 :
                count-=1
            else:
                count+=1
            if count in hashm.keys():
                maxv = max(maxv, i- hashm[count])
            else:
                hashm[count] = i
        return maxv        