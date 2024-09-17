"""
 FAANMG Problem #18 {Medium}


525. Contiguous Array

Time Complexity : O(N)
 

Space Complexity : O(N)


Did this code successfully run on Leetcode : Yes


A hashmap is created to store the running Sum

The array is iterated till the last element
As we have to return the maximum length of a contiguous subarray with an equal number of 0 and 1..

Here 0 is considered to be -1
    and 1 is considered as 1 
    
there is maximum Number that is storing the current max balanced length 

For each iteration the running sum is calculated by adding with the Value as above for the corresponding index
    If the rSum is in the hashmap, 
     then max of the the current maxn and the index - the previous index of the rSum is calculates
     
     else add the corresesponding index of the rSum to the hashmap
  

    
@name: Rahul Govindkumar_RN27JUL2022
"""


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        hashmap = {0:-1}
        rSum = 0
        maxN = 0
        for i in range (len(nums)):
            
            if(nums[i]==0):
                rSum -= 1
            else:
                rSum += 1
                
            if(rSum in hashmap):
                maxN = max(maxN, i - hashmap[rSum])
            else:
                hashmap[rSum] = i
        return maxN
                
                
        
        