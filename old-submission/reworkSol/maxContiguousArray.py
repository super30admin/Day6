'''
LeetCode: https://leetcode.com/problems/contiguous-array/

We are going to use RUNNING SUM APPROACH
'''

class Solution:
    
    def solution(self,inputList):
        
        # Return maxSubarraySum
        maxSubArray = 0
        
        # Initialize runningSum
        runningSum = 0
        
        '''
        If 0 --> subtract -1
        If 1 --> add +1
        '''
        
        # Initialize the dict
        dict = {}
        # Key will be "runningSum" and value will be "indexIt First Appeared"
        dict[0] = -1
        
        
        # Iterate the inputList
        for i in range(0,len(inputList)):
            
            if inputList[i] == 0:
                runningSum -=1
                
            elif inputList[i] == 1:
                runningSum +=1
            
            # Check if runningSum is in the dict
            if runningSum in dict:
                # replace maxSubArray with (index-indexFirstSeen) if its greater
                
                cal = i - dict[runningSum]
                
                if maxSubArray < cal:
                    maxSubArray = cal
        
            
            else:
                dict[runningSum] = i
                
        print('Max subarray with equal no. of 0\'s and 1\'s is:\t',maxSubArray )
                
        
sol = Solution()
sol.solution([1,0,1,0,0,1,1])