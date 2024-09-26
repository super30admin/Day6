# Runnig on Leetcode:  Yes
# Runtime complexity:  O(n)
# Memeory complexity:  O(n)


class Solution:
    def findMaxLength(self, nums):
        Sum = 0
        d = {0:-1}
        maximum = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                Sum -= 1
            else:
                Sum += 1

            if Sum in d:
                maximum = max(maximum, i-d[Sum])
            else: 
                d[Sum] = i

        return maximum