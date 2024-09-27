# S30 Big N Problem #17 {Medium}

# Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

# Time Complexity : O(n) n= no. of elements in the array
# Space Complexity : O(n) n= no. of elements in the array
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 

# Treat 0 as -1 and 1 as 1
# Iterate from first to last element in the array and maintain their sum.
# Add the sum with the index as the key, value pair
# If the sum is 0, then length of subarray is from the 1st element
# Othwerwise, if the sum is present is dictionary calculate the subarray

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        dic={}
        
        curr=0
        cnt=0
        for i in range(0,len(nums),1):
            
            # Go on adding to the sum based on 0 or 1
            if nums[i]==0:
                curr+=-1
            else:
                curr+=1
            
            if curr==0:
                cnt=max(i+1,cnt)
            
            else:
                # if sum !=0, find the sum in dic. Calculate the subarray length.
                if dic.get(curr,-1)!=-1:
                    cnt=max(cnt,i-dic[curr])
            
            # Replace the value of dic with min. index value
            if dic.get(curr,-1)==-1:
                dic[curr]=i
            else:
                dic[curr]=min(dic[curr],i)
                
        
        return cnt
                    
                
                
            
            
        