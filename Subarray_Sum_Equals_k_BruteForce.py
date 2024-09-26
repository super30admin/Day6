# Created by Aashish Adhikari at 3:39 PM 12/31/2020

'''
Time Complexity:
O(n^2) since we have a nested for loop, n is the length of the array

Space Complexity:
O(1) since constant space used regardless of the input.
'''

# Brute-Force Approach
class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        ctr = 0
        for i in range(len(nums)):
            # Check if this single element equals k.
            if nums[i] == k:
                ctr += 1

            # Maintain a running sum including the current element from where we begin
            running_sum = nums[i]
            for j in range(i + 1, len(nums)):
                running_sum += nums[j]

                if running_sum == k:
                    ctr += 1

        return ctr

