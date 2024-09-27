# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
    def subarraySum(self, nums: [int], k: int):
        count = 0
        sum = 0

        runningSum = dict()
        runningSum[0] = 1

        for i in nums:
            sum += i
            c = sum - k
            if c in runningSum:
                count += runningSum[c]
            if sum not in runningSum:
                runningSum[sum] = 0

            runningSum[sum] += 1

        return count


r = Solution()
nums = [1, 1, 1]
k = 2
print("Total number of continuous sub arrays whose sum equals to", k, "is:", r.subarraySum(nums, k))
