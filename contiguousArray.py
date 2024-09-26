# // Time Complexity : O(n) Worse Case - O(n^2)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :
#
#
# // Your code here along with comments explaining your approach

class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        dict_indexes = {}
        running_sum = 0
        max_length = 0
        dict_indexes[running_sum] = -1

        for i in range(0,len(nums)):
            if nums[i] == 0:
                running_sum -= 1
            else:
                running_sum += 1
            if running_sum in dict_indexes:
                temp_len = i - dict_indexes[running_sum]
                if temp_len > max_length:
                    max_length = temp_len
            else:
                dict_indexes[running_sum] = i

        return max_length

