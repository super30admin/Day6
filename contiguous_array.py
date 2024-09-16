# Time Complexity : O(n)   - we are traversing through the given array to find the prefix-sum in linear time
# Space Complexity : O(1)   - we are using constant space without having extra space.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 


class Solution:
    def findMaxLength(self, nums) -> int:
        
        n = len(nums)  
        
        d = dict()  #open a hashmap (dictionary in pthon)
        d[0] = -1   #iniate the first value as -1 inorder to capture the first subarray
        rSum, ans = 0, 0   #initiate the running sum as 0 and the ans as 0 , here ans refers to the present maximum value
        
        for i in range(n):   #traverse through the array with index
            
            if nums[i] == 1:  #if array val is 1, then increase the running sum by 1
                
                rSum+=1 
                
            else:      #else, decrease the running sum by 1
                 
                rSum-=1   

             #basically, whenever the running sum is zero, it means the array past that is balanced and we are going to update the length with the maximum value we got.  
                
            if rSum in d: #check if running sum is already in the hashmap, if yes compare the difference of index and value of runningSum in hashmap with the past max value, and make the resultant as new max 
                         
                ans = max(ans, i - d[rSum])  
                
            else:  #if the value is not found, then initialize it in the hashmap
                d[rSum] = i  
                
        #ans should give the largest subarray length that is balanced
        
        return ans