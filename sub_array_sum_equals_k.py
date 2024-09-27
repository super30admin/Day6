# Time complexity = O(N)
# Space COmplexity = O(N)
# Yes, it ran on Leetcode


class Solution(object):
    def subarraySum(self, nums, k):
        dic = {0: 1}
        res = 0
        curr_sum = 0

        for i in range(len(nums)):
            curr_sum += nums[i]
            if curr_sum - k in dic:
                res += dic[curr_sum - k]
                if curr_sum not in dic:
                    dic[curr_sum] = 1
                else:
                    dic[curr_sum] += 1

            else:
                if curr_sum not in dic:
                    dic[curr_sum] = 1
                else:
                    dic[curr_sum] += 1

        return res