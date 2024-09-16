class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        dataStore = dict()
        
        dataStore[0] = -1
        runningSum = 0
        counter =0
        dataStore[runningSum] = 1
        for index,num in enumerate(nums):
            
            runningSum += num
            
            if runningSum-k in dataStore:
                counter += dataStore[runningSum-k]
                
            if runningSum not in dataStore:
                dataStore[runningSum] = 0
            
            dataStore[runningSum] += 1
            
        
        return counter
    

#      Time complexity is o(n) as we are doing things in one pass

#  The approach we are taking here is that we are noting the running sum and number of times a running sum is seen too, before we do that though, we are basically checking if runningSum - k has already been seen before, if so, we add the number of times it is seen before to counter 
                
            
                
            
            
            
            
            
        
