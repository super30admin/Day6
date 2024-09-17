## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)

# Time Compexity: O(n) -- Since we are parsing the whole array and calculating the sum at each index
# Space Complexity: O(n) -- Since we are using a hashmap to store the summation
# Leetcode sum solved successfully?: Yes
#Code:
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        subsum_dict = {0: 1}
        total_number_of_subarrays = 0
        summ = 0
        
        for i in range(len(nums)):
            summ = summ + nums[i]  # Calculate sum at each index
            difference = summ - k  # Calculate the difference 
            
            if difference in subsum_dict:               # check if the difference number has already occured in hashmap, if it yes that means we found a subarray whose sum is k
                total_number_of_subarrays += subsum_dict[difference]
            
            if summ in subsum_dict:   # Check if sum is in hashmap, if yes increase count else include the sum wil value as 1
                subsum_dict[summ] += 1
            else:
                subsum_dict[summ] = 1
        
        
        return total_number_of_subarrays

# Approach: In this problem, we first calcualte the sum at each index and do the difference with the target value, 
#           If we have found a difference in hashmap that means we have found a subarray who sum is equal to k.
#           We then add how many time differnece value has occured to total subarrays and in the end return the total subarray that can be formed.  
