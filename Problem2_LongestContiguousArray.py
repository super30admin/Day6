'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
S30 SlackID : RN32MAY2021
=================================
'''

# 525. Contiguous Array
# Given a binary array nums, return the maximum length of a contiguous 
# subarray with an equal number of 0 and 1.

# Example 1:

# Input: nums = [0,1]
# Output: 2
# Explanation: [0, 1] is the longest contiguous subarray with 
# an equal number of 0 and 1.

# Example 2:
# Input: nums = [0,1,0]
# Output: 2
# Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray
# with equal number of 0 and 1.

# Constraints:
# 1 <= nums.length <= 10^5
# nums[i] is either 0 or 1.

#-----------------
# Time Complexity: 
#-----------------
# O(N): Need to iterate over input array once regardless
#------------------
# Space Complexity: 
#------------------
# O(N) - Need hashmap to store maximum N <key,value> pairs because of:
#        Worst case when input is all 1s or 0s

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes
# Time             :  784 - 1068  ms (99.80 - 5.10 %ile)
# Space            :  18.9 MB (29.44 %ile)


from typing import List
class Solution:

    def findMaxLength(self, nums: List[int]) -> int:
        # Iterate over each element and for each element,
        # Cumulative sum += 1 if element at i is 1 else += -1

        # Whenever we encounter a cumulative sum we have encountered before
        # (say csum_prev at index i), we update the max_len of contiguous 
        # array with equal 0s and 1s if the 
        # current index (i) - previous index (k) > current max_len

        # Rationale: When we encounter a cumulative sum we have before
        # it means that the subarray elements between now and then have 
        # equal 0s and 1s
        
        sum_index_map = {} # {sum (key) : index (value)}
        sum_index_map[0] = -1 #The last index of subarray where cumul_sum = 0 is 

        max_len = 0
        cumul_sum = 0
        for i in range(len(nums)):
            cumul_sum += (1 if nums[i] == 1 else -1)
            if cumul_sum in sum_index_map:
                if i - sum_index_map[cumul_sum] > max_len:
                    max_len = i - sum_index_map[cumul_sum]
            else:
                # Add the first occurrence of a cumul_sum to hashmap
                # Always use first occurrence if we encounter
                # another index with same culum_sum to find the length
                # of the longest contiguous subarray with equal 0s and 1s
                sum_index_map[cumul_sum] = i

        return max_len



obj = Solution()
print(obj.findMaxLength([1,0,0,1,0,1,0,1,1])) # Correct ans: 8 (index 0 - 7)
