class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if(nums== None or len(nums)<=1):
            return 0
        max1=0
        runsum=0
        dictsub={0:-1}
        
        for i in range(len(nums)):
            if(nums[i]==0):
                runsum=runsum-1
                #print(runsum,"1")
            else:
                runsum=runsum+1
                #print(runsum,"after")
           
            #if running sum already exists, just find max of two   
            if((runsum)  in dictsub):
                #print("hi")
                max1=max(max1,i-dictsub[runsum])
            # else add runsum and corresponding index value
            else:
                dictsub[runsum]=i
                
                
            #print(dictsub)
        return max1
                
            
        
        