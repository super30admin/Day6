#Time Comlexity: Using maps we can access elements in O(1). Then for traversing the array to calculate curr_sum is O(n).
#Space Complexity: Auxilary space-O(n)
#Ran succeffuly on Leetcode: Yes
#Difficulties faced: To come up with solution with hashmaps. 

# If value of currsum is equal to desired sum at any instance increment count of subarrays by one.  
#From the map find number of subarrays previously found having sum equal to currsum-sum.  
#So increase count by the number of such subarrays. 
#Note that when currsum is equal to desired sum then also check number of subarrays previously having sum equal to 0. 
#Excluding those subarrays from current subarray gives new subarrays having desired sum.
#Increase count by the number of subarrays having sum 0 in that case.

#Algorithm in steps:
#Create an map with current sum of elemnts till ith iteration and check if the curr_sum is equal to k or if the curr_sum-k already exists in the calculated prefix_sum.
#If curr_sum==k, increment the cnt for finding subarray. 
#If the curr_sum-k exists is the prefix sum calculated, increment the cnt for that particular value in the map.This indicates that, the index next to the place where the match was found will have the subarray sum =k till present index.  
#If the curr_sum is not found in the prefix_summ array, create a key with that prefix sum and assign its value as 1. 


from collections import defaultdict
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if  len(nums)==0:#return false if the array is null
            return 0
        prefix_sum = defaultdict(lambda : 0) 
        
        cnt=0
        curr_sum=0
      
        for i in range (0,len(nums)):
            
            curr_sum+=nums[i]#calculating the current sum of each element till that iteration 
            
            if curr_sum==k:
                cnt+=1
            if (curr_sum-k) in prefix_sum:
               cnt+= prefix_sum[curr_sum-k]#increment the cnt of the curr_sum if it exists in prefix_sum
            
            prefix_sum[curr_sum]+=1# insert the new curr_sum with its respective cnt. 
        return cnt
        
