# Time complexity = O(N)
# Space COmplexity = O(1)
# Yes, it ran on Leetcode



class Solution(object):
    def findMaxLength(self, nums):
        dic = {0: -1}
        res = 0
        curr_sum = 0

        for i in range(len(nums)):
            if nums[i] == 1:
                curr_sum += 1
            else:
                curr_sum -= 1

            if curr_sum in dic:
                res = max(i - dic[curr_sum], res)
            else:
                dic[curr_sum] = i

        return res
