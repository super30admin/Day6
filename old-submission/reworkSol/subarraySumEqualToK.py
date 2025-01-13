'''
LeetCode: https://leetcode.com/problems/subarray-sum-equals-k/

We are going to use RUNNING SUM APPROACH
'''
class Solution:
    
    def __init__(self):
        
        self.subarrayCount = 0
        
        self.runningSum = 0
        
        self.dict = {}
        self.dict[0] = 1
    
    def getSolution(self,inputList,target):
        
        # Iterate the inputList
        for i in range(0,len(inputList)):
            self.runningSum += inputList[i]
            
            # Check if difference of runningSum is in dictionary
            if (self.runningSum-target) in self.dict:
                self.subarrayCount += self.dict[self.runningSum-target]
            
            # Check if runningSum is in dictionary
            if self.runningSum not in self.dict:
                self.dict[self.runningSum] = 1
            else:
                self.dict[self.runningSum] = self.dict[self.runningSum] +1
            
        print('Subarray count is:\t',self.subarrayCount)

sol = Solution()
sol.getSolution([3,4,7,2,-3,1,4,2,0,1],7)