#O(n) time and O(n) space where n is length of nums array
# passed all test cases
class Solution:
    def subarraySum(self, nums, k):
        sum_counts = {}
        cumulative_sum = 0
        count = 0
        for i in range(len(nums)):
            if cumulative_sum not in sum_counts:
                sum_counts[cumulative_sum] = 0
            sum_counts[cumulative_sum] += 1

            cumulative_sum += nums[i]

            if cumulative_sum - k in sum_counts:
                count += sum_counts[cumulative_sum - k]
        return count


s = Solution()
print(s.subarraySum([0,0,0,0,0],0))