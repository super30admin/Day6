"""
 FAANMG Problem #17 {Medium}


560. Subarray Sum Equals K

Time Complexity : O(N)
 

Space Complexity : O(N)


Did this code successfully run on Leetcode : Yes


A hashmap is created to store the running Sum

The array is iterated till the last element
As we have to return the total number of subarrays whose sum equals to k.
    For each iteration the running sum is calculated by adding with the number of the corresponding index
    If the diferent of the rSum and the target is in the hashmap, then the count is update by adding it with the value i.e hashmap[rSum-k]
    
    If the Difference value is not there in the hashmap, 
    then the rSum is aded with the counter 1 else its updated with the +1 along with the existing value

  

    
@name: Rahul Govindkumar_RN27JUL2022
"""


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        hashmap={0:1}
        
        rSum=0
        result =0
        
        for i in range(len(nums)):
            
            rSum += nums[i]
            
            if (rSum - k) in hashmap:
                result = result + hashmap[rSum-k]
                
            if rSum not in hashmap:
                hashmap[rSum]=1
            else:
                hashmap[rSum]=hashmap[rSum]+1
            
        return result
            
        
        
        