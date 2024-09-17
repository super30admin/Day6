## Problem2 (https://leetcode.com/problems/contiguous-array/)

# Time Compexity: O(n) -- Since we are parsing the whole array and calculating the sum at each index
# Space Complexity: O(n) -- Since we are using a hashmap to store the summation
# Leetcode sum solved successfully? : Yes
# Code:
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        sum_dict = {0:-1}
        summ = 0
        subarr_long = 0
        for number in range(len(nums)):
            if nums[number] == 1:  # Check if value at index is 1 or 0
                summ = summ + 1
                if summ in sum_dict:  # Check if summ is already present in the dictionary
                    value = sum_dict[summ]
                    subarr_long = max(subarr_long, number - value )  # If yes, we take the max of current maximum and the value obtained
                else:
                    sum_dict[summ] = number
            else:               # Same case when the value at the index is 0
                summ = summ - 1   
                if summ in sum_dict:
                    value = sum_dict[summ]
                    subarr_long = max(subarr_long, number - value )
                else:
                    sum_dict[summ] = number
                
        
        return subarr_long
# Approach: In this problem, we first check whether the incoming number is 1 or 0, if it is 1, we add it by 1 else we suvbtract the sum by -1. 
#           If we encounter repeating sum, that means that equal number of 0's and 1's are identified in the particular range.
                    
