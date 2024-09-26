## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)

class Solution:
    def subarraySum(self, nums: list[int], k: int) -> int:
        ans = 0
        prefsum = 0
        d = {0: 1}

        for num in nums:
            prefsum = prefsum + num

            if prefsum - k in d:
                ans = ans + d[prefsum - k]

            if prefsum not in d:
                d[prefsum] = 1
            else:
                d[prefsum] = d[prefsum] + 1

        return ans


sol = Solution()


nums = [1, 1, 1]
k = 2
print(sol.subarraySum(nums, k))   

nums = [1, 2, 3]
k = 3
print(sol.subarraySum(nums, k))  
