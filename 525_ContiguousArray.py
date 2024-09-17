"""
Leetcode - https://leetcode.com/problems/contiguous-array/ (submitted)
TC - O(N), SC - O(N) : saving rsums in hashmap
Lecture - https://youtu.be/2riNDAD4GgM
NOTE - Running sum can be used for finding a target in a contiguous array


Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

Example 1:
Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.

Example 2:
Input: nums = [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.

Constraints:
1 <= nums.length <= 105
nums[i] is either 0 or 1.
"""

'''
Idea - 
Running sum: Consider 1 as 1 and 0 as -1, maintain a running sum, if the running sum exists, the elements between them
make balanced contiguous substring (sum is 0). Compare against the max length and adjust.
Also maintain a dummy value to consider the first element as well (something to compare to)
'''
class Solution:
    def findMaxLength(self, nums):
        dict_rsum = {0: -1}
        max_length = 0
        r_sum = 0
        for i in range(len(nums)):
            # 0 -> -1, 1-> 1
            if nums[i] == 0:
                r_sum -= 1
            else:
                r_sum += 1
            if r_sum not in dict_rsum:
                dict_rsum[r_sum] = i
            else:
                # |____.___|
                # --a--
                # -----b---
                #      -c-
                # c = b - a
                #
                # Also, leave the fist index of the running sum in hashmap for the running index
                max_length = max(max_length, i - dict_rsum[r_sum])
        return max_length

arr = [0, 1]
result = Solution().findMaxLength(arr)
print(result)





