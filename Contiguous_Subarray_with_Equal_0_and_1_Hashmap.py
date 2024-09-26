# Created by Aashish Adhikari at 5:36 PM 1/1/2021

'''
Time Complexity:
O(1) since we traverse the array just once.

Space Complexity:
O(1)

'''

class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        hashmap = {}

        # Handle the edge case
        hashmap[0] = -1

        running_sum = 0
        max_leng = 0
        for idx in range(len(nums)):

            if nums[idx] == 0:
                running_sum -= 1
            else:
                running_sum += 1

            if running_sum not in hashmap:
                hashmap[running_sum] = idx

            else:
                leng = idx - hashmap[running_sum]

                if leng > max_leng:
                    max_leng = leng

        return max_leng
