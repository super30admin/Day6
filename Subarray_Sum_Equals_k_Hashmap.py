# Created by Aashish Adhikari at 9:58 PM 1/2/2021

'''
Time Complexity:
O(n)

Space Complexity:
O(1)
'''

class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """

        hm = {}
        hm[0] = 1

        running_sum = 0
        count = 0

        for idx in range(len(nums)):

            running_sum += nums[idx]


            if running_sum - k in hm:
                count += hm[running_sum-k]



            if running_sum not in hm:
                hm[running_sum] = 1
            else:
                hm[running_sum] += 1

        return count
