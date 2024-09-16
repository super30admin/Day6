class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        runningsum=0
        maxlen=0
        sub={0:1}
        #Edge case
        if(nums== None or len(nums)==0):
            return 0
        for i in range(len(nums)):
            #find the running sum for each iteration
            runningsum+=nums[i]
            comp=runningsum-k
            
            #finding max count
            #if the complimemt exists in dict increase maxvalue by 1
            if(comp  in sub):
                maxlen=maxlen + sub[comp]
                
            #key-->running sum in dictionary value-->1 if it occurs for first time else increment by 2
            if(runningsum not in sub):
                sub[runningsum]=1
            else:
                sub[runningsum]+=1
        return maxlen
                
            
            
        
        