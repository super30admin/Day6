"""
Leetcode - https://leetcode.com/problems/subarray-sum-equals-k/
TC- O(N), SC- O(N)
Lecture- https://youtu.be/2riNDAD4GgM
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:
Input: nums = [1,1,1], k = 2
Output: 2

Example 2:
Input: nums = [1,2,3], k = 3
Output: 2

Constraints:
1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 107
"""

'''
Idea - same logic as maximum length of contiguous array, except here our desired array is sum of K.
Using running sum, we can get the sum by subtracting rsum[i] and rsum[j] to see if it's equal to k, in other words,
if there exits any rSum - k exists. (refer lecture)
'''


class Solution:
    def subarraySum(self, nums, k):
        result = 0
        dict_rsum = {0: 1}
        rsum = 0
        for j in range(len(nums)):
            rsum += nums[j]
            # lookup if rsum - k exists
            if rsum - k in dict_rsum:
                result += dict_rsum[rsum - k]
            # store rsum and count in hashmap - multiple occurences means more desired arrays
            if rsum in dict_rsum:
                dict_rsum[rsum] += 1
            else:
                dict_rsum[rsum] = 1

        return result


arr = [1, 1, 1]
k = 2
result = Solution().subarraySum(arr, k)
print(result)
