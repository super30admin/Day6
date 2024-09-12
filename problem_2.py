# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#
#

class Solution:
    def findMaxLength(self, nums: list[int]) -> int:
        dictu = {0: -1}
        dicturs = {0: -1, 1: 1}
        running_sum = 0
        count = 0
        for i in range(len(nums)):
            running_sum += dicturs[nums[i]]
            if running_sum not in dictu:
                dictu[running_sum] = i
            else:
                if count < (i - dictu[running_sum]):
                    count = i - dictu[running_sum]
        return count


check = Solution()
print(check.findMaxLength([0, 1]))