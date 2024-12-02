class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        '''// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach'''
        #Initialize running sum to 0
        rsum=0
        
        #Dummy value to take care of the initial balanced array
        rmap={0:-1}
        max_length=0
        
        for i in range(len(nums)):
            # if the val is 1 then increment by 1 else decrement by 1
            if nums[i] == 1:
                rsum += 1
            else:
                rsum -=1
            #Update the max_length if the running sum has occured earlier 
            if rsum not in rmap:
                rmap[rsum]=i
            else:
                max_length=max(max_length, i-rmap[rsum])
        return max_length
            
            
        
    
        
