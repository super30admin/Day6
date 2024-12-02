#TC:O(N) SC:O(N)
#Running runningSum

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        dict = {}
        dict[0] = -1
        runningSum=0
        maxSubArray = 0

        for i in range(len(nums)):
          
            if nums[i]==1:
                runningSum = runningSum+1
            else: 
                runningSum = runningSum-1
             
            
            if runningSum in dict.keys(): 
                maxSubArray = max(maxSubArray, i - dict[runningSum])
                
            else:
                dict[runningSum] = i
           
        
        return maxSubArray
