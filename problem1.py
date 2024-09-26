# Time Complexity : O(N), 
# Space Complexity :O(N)

# Did this code successfully run on Leetcode : 
# YEs

# Any problem you faced while coding this : 

# Your code here along with comments explaining your approachclass Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if nums==None and len(nums)==0 : 
            return 0
        hashm = {}
        hashm[0] = 1
        count = 0
        rsum= 0
        for i in range (len(nums)):
            rsum+=nums[i]
            if rsum-k in hashm.keys():
                count += hashm[rsum-k]
            if rsum in hashm.keys():
                hashm[rsum]+=1
            else:
                hashm[rsum] =1
        return count    
        