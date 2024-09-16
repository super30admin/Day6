
# // Time Complexity : # we will have O(n)
# // Space Complexity :O(n)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : no
class Solution:
    def findMaxLength(self, nums) -> int:

    #dictionary will store count as key and index as value
        dict={}
        count=0
        subarray=0
    
    #iterate over array
        for i in range(len(nums)):
        
            if nums[i]==0:
                count-=1
            if nums[i]==1:
                count+=1
            if count==0:
                subarray=i+1
            if count in dict:
            
                subarray=max(subarray, i-dict[count])
            else:
                dict[count]=i
            
        return subarray