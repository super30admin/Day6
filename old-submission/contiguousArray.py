'''
Approach:

1. If you see 0, sub -1 from "sum"
2. If you see 1, add +1 to the "sum"
3. If sum doesnt exisit in dictionary create pair {sum:<firstIndexPosition>}
4. If sum exist in dictionary subtract "currentIndex - <firstIndexPosition>"; if 
it's greater than "subarrayCount", update the variable

Time Complexity:
1. Iterating the list of size num , complexity is 0(n) where n is size of list
'''

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        # Create Dictionary
        newDict = {}
        
        # Set sum; our 0th sum will be at -1 location because we have not yet traversed the list
        sum = 0 
        newDict[0] = -1
        
        # If you see 0 ---> sub -1
        # If you see 1 ---> add +1
        # Maintain (sum-firstAppearaceIndex) in new-dictionary
        
        # Return subarray-count with equal number of 0's and 1's
        subarrayCount = 0
        
        for index in range(0,len(nums)):
            
            # Case 1: Value is 0
            if nums[index] == 0:
                sum -=1
            
            # Case 2: Value is 1
            elif nums[index] == 1:
                sum +=1
            
            if sum not in newDict:
                # Store (sum-firstAppearaceIndex)
                newDict[sum] = index
            
            else:
                initialIndex = newDict[sum]
                
                if subarrayCount < index - initialIndex:
                    subarrayCount = index-newDict[sum]
                
        #print('newDict is:\t',newDict)
        
        # Return the sum of appeared key **except 0
        #print(subarrayCount)
        
        return subarrayCount