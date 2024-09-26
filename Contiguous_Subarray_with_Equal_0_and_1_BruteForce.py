# Created by Aashish Adhikari at 4:17 PM 1/1/2021

'''
Time Complexity:
O(n^2) since we are using a nested for loop , n is the length of the array input

Space Complexity:
O(1)

'''

class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        length = 0
        for i in range(len(nums)):

            sum = 0
            for j in range(i, len(nums)):
                if nums[j] == 0:
                    sum -= 1
                else:
                    sum += 1

                if sum == 0:
                    if j-i+1 > length:
                        length = j-i+1
        return length