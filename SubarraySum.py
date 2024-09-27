#Time Complexity : O(N)
#Space Complexity :O(N)
#Procedure
class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        
        if len(nums) == 1:
            if k == nums[0]:
                return 1
            else:
                return 0
        d ={}  # make a dicionary of index 0 and key =1
        d[0]=1
        s = 0
        count = 0
        for i in range(len(nums)):
            s+=nums[i]
            if s-k in d:    #check if sum - key ==0 is present if present 
                count+=d[s-k]   #count
            if s in d:     # if key (sum) is in dictionary 
                d[s]+=1    # increment the value
            else:
                d[s]=1     # assign key sum =1
        return count