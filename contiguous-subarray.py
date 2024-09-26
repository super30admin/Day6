'''
Approach: Running sum pattern
TC: O(n)
SC: O(n)
'''


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:

        running_sum = 0
        dict1 = {0: -1}
        new_max = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                running_sum -= 1
            else:
                running_sum += 1

            if running_sum in dict1:

                x = dict1[running_sum]  # earliest index at which the running_sum exists
                y = i - x  # contiguous subarray
                new_max = max(new_max, y)
            else:
                dict1[running_sum] = i
        return new_max




