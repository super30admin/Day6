# S30 Big N Problem #16 {Medium}

# Given an array of integers and an integer k, find the total number of continuous subarrays that can be formed such that sum of the subarrays is equals to k.

# Time Complexity : O(n) n= no. of elements in the array
# Space Complexity : O(n) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 

# Approach:
# Access the elements of the araay from 1 to last element
# Maintain the sum in dictionary with the least index value
# When sum is 0, calculate the length from 1st element
# else if the sum is present in the dic, calculate the length from index value

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        dic={}
        
        currsum=0
        cnt=0
        for i in range(0,len(nums),1):
            
            currsum+=nums[i]
            if currsum==k:
                cnt+=1
                
                if dic.get(0,-1)!=-1:
                    cnt+=dic[0]
            else:
                if dic.get(currsum-k,-1)!=-1:
                    cnt+=dic[currsum-k]
            
            if dic.get(currsum,-1)==-1:
                    dic[currsum]=1
            else:
                    dic[currsum]+=1
        
        return cnt
            
            
            
