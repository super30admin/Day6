# Time Complexity O(n)

class Solution(object):
    def findMaxLength(self, nums):
        current_sum = 0
        max_length = 0
        if not nums:
            return 0
        d = {}
        for i in range(len(nums)):
            if nums[i] == 1:
                current_sum -=1
            else:
                current_sum +=1

            if (current_sum == 0):
                max_length= i+1

            if (current_sum not in d):
                d[current_sum] = i
            else:
                max_length = max(max_length, i-d[current_sum])

        return max_length

        """
        :type nums: List[int]
        :rtype: int
        """
