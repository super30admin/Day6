class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        rsum=0
        d={}
        m=0
        d[0]=-1
        
        for i in range(len(nums)):
            if nums[i]==1:
                rsum+=1
            else:
                rsum-=1
            if rsum not in d:
                d[rsum]=i
            else:
                m=max(m,i-d[rsum])
         
                
        return m
                
                
                
            
            