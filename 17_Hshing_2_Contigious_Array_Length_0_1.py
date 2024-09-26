#Time Complexity : O(N) where N is the numbers present in the list
#Space Complexity : O(N) for using one hashmap
#Did this code successfully run on Leetcode : Yes but after seeing today's lecture video
#Any problem you faced while coding this : Yup, I could not solve the question until I saw the lecture video

#Your code here along with comments explaining your approach

class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        maxlen=0
        d={}
        d[0]=-1
        
        sum=0
        
        for i in range(len(nums)): 
            if nums[i]==1: 
                sum=sum+1
            elif nums[i]==0: 
                sum=sum-1
            
            if sum in d: 
                maxlen=max(maxlen,i-d[sum])
            else: 
                d[sum]=i
                
        return maxlen        
        