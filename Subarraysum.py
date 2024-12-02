class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        '''// Time Complexity : O(n)
        // Space Complexity : O(n)
        // Did this code successfully run on Leetcode : Yes
        // Any problem you faced while coding this : No


        // Your code here along with comments explaining your approach'''
        
        rsum=0
        count=0
        
        rmap={0:1}
        
        for i in range(len(nums)):
            rsum += nums[i]
            #check if the difference is present in the hashmap as a key
            if rsum-k in rmap:
                count+=rmap[rsum-k]
            #If the sum is in the key update the value else make a new entry
            if rsum in rmap:
                rmap[rsum]+=1
            else:
                rmap[rsum]=1
           
            
        return count
                
        
