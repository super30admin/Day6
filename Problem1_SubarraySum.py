'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
S30 SlackID : RN32MAY2021
=================================
'''

# 560. Subarray Sum Equals K
# Given an array of integers nums and an integer k, 
# return the total number of continuous subarrays whose sum equals to k.

# Example 1:
# Input: nums = [1,1,1], k = 2
# Output: 2

# Example 2:
# Input: nums = [1,2,3], k = 3
# Output: 2

# Constraints:
# 1 <= nums.length <= 2 * 10^4
# -1000 <= nums[i] <= 1000
# -10^7 <= k <= 10^7

#-----------------
# Time Complexity: 
#-----------------
# O(N): Need to iterate over input array once
#------------------
# Space Complexity: 
#------------------
# O(N) - Need hashmap to store maximum N <key,value> pairs

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes
# Time             :  244-260 ms (92.79 - 50.85 %ile)
# Space            :  16.6-17.3 MB (96.32 - 36 %ile)

from typing import List

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        # Stores sum as key and the count of the number of subarrays that make
        # that sum as value.
        subarr_sum_count = {}# {sum (key) : count (value)}

        # Stores the number of subarrays with elements that add up to input "k"
        res = 0

        # Temporary variable to calculate cumulative sum during iteration
        current_sum = 0

        # Iterate over each element in array
        for i in range(len(nums)):
            # Add value of current element to cumulative sum
            current_sum += nums[i]
            
            # If cumulative sum adds up to k
            if current_sum == k:
                # Increment result
                res += 1
            
            # If there is an element in the currently iterated elements
            # s.t. removing it would result in the sum of the remaining 
            # subarray elements adding up to k
            # i.e., if element = current_sum - k => current sum - element = k, 
            # then (iterated_subarr - element) will add up to k
            if (current_sum - k) in subarr_sum_count:
                # Adding the count of all such subarrays whose sums add up to
                # current_sum - k.
                res += subarr_sum_count[current_sum-k]

            if current_sum in subarr_sum_count:
                # If current sum is already in the hashmap, Increment count
                # This happens when there are negative elements
                subarr_sum_count[current_sum] += 1
            else:
                # Otherwise, initialize the key to be 1 as we have found a
                # subarray which adds up to k
                subarr_sum_count[current_sum] = 1

        # Return result
        return res

    def subarraySumBF(self, nums: List[int], k: int) -> int:
        #BRUTE FORCE:
        res = 0
        for i in range(len(nums)):
            cumul_sum = 0
            for j in range(i, len(nums)):
                cumul_sum += nums[j]

                if cumul_sum == k:
                    res += 1

        return res

obj = Solution()
print(obj.subarraySum([10, 2, -2, -20, 10], -10))
print(obj.subarraySumBF([10, 2, -2, -20, 10], -10))