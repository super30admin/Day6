class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        rsum=0
        d={}
        d[0]=1
        count=0
        
        for i in range(len(nums)):
            rsum+=nums[i]
            
            if rsum-k in d:
                count+=d[rsum-k]
                
            if rsum in d:
                d[rsum]+=1
            else:
                d[rsum]=1
            
        return count
        