# Did this code successfully run on Leetcode: Yes
# Time Complexity: O(n)
# Space Complexity: O(n) since mapper takes cumulative sum & sum can have n values.
# Logic: start calculating the cumulative sum, if sum -k exist in dic that means k sum just passed & increment the count
# with the occurance of sum -k, update the occurance of sum for future sum -k use.

class Solution:
    def subarraySum(self, nums, k):
        mapper = {0: 1}
        count = 0
        sum = 0
        for i in range(len(nums)):
            sum += nums[i]
            if sum - k in mapper:
                count += mapper[sum - k]
            if sum in mapper:
                mapper[sum] += 1
            else:
                mapper[sum] = 1
        return count
