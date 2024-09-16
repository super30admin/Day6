class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        dataStore = dict()
        longestArr=0
        dataStore[0] = -1
        runningSum = 0
        for index,num in enumerate(nums):
            if num==1:
                runningSum+=1
            else:
                runningSum-=1
            if runningSum not in dataStore:
                dataStore[runningSum] = index
            
            else:
                if index-dataStore[runningSum] > longestArr:
                    longestArr = index - dataStore[runningSum]
                    
        
        print(dataStore)
                
            
        return longestArr
    
    
# Time complexity is o(n) as we are doing everything in single iteration.
#  Approach is to maintain a running sum, basically add running sum as 0 for index -1 as it covers a certain edge case,
#  next take a hashMap and store first occurence of each running sum as index and the index at which it is occuring as 
#  value. Now when we find a repeated runningSum at some future index, we basically subtract that index from the one existing in the hashmap. we return the max such value

#  This works is that contiguous array elements would be equal only if running sum is equal at two different indexes.
            
        
        
