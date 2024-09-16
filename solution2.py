# https://leetcode.com/problems/contiguous-array
# // Time Complexity : o(n)
# // Space Complexity : o(n)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : None
#

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        sum1 = []
        sum1.append(0)
        temp = 0
        hm = dict()
        max_length = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                nums[i] = -1
        for i in range(len(nums)):
            temp = temp + nums[i]
            sum1.append(temp)

        for i in range(len(sum1)):

            if sum1[i] not in hm:
                hm[sum1[i]] = i
            else:
                max_length = max(max_length, i - hm[sum1[i]])
        return max_length