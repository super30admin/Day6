# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
    def findMaxLength(self, nums: [int]):
        maxLength = 0
        total_sum = 0
        indexMap = dict()

        for i, num in enumerate(nums):
            if num == 0:
                total_sum -= 1
            else:
                total_sum += 1
            if total_sum == 0:
                maxLength = i + 1
            if total_sum in indexMap:
                if maxLength < i - indexMap[total_sum]:
                    maxLength = i - indexMap[total_sum]
            else:
                indexMap[total_sum] = i
        return maxLength


r = Solution()
nums = [1, 1, 1, 1, 0, 1, 0, 1, 0, 0]
print("Maximum length of a contiguous subarray is:", r.findMaxLength(nums))
