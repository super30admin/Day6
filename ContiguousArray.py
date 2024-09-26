#Using The Rsum Concept
#TimeComplexity:O(n)
#SpaceComplexity:O(n)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this :No
#Used the RSUM approach to do the problem
# We can say that the elements between two indexes are balanced(contiguous) if the run sum is same for the indexes.
# We stopre initialy {0:-1} because we assume that run sum is 0 at -1 to make sure initial array is also calculated

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        sum = 0
        map = {0:-1}
        maxe = 0
        for i in range(0,len(nums)):
            
            if nums[i] == 1:
                sum = sum+1
            else:
                sum = sum-1
            if sum not in map:
                
                map[sum] = i
            else:
                
                maxe = max(maxe,i - map[sum])
                
        return maxe
        
                
            
            
           
                
            
            
        