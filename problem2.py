# Time Complexity : O(n)
# Space Complexity:o(n)
#  Did this code successfully run on Leetcode : Yes

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        maxCount = 0
        hashMap = {0: -1}
        sum = 0

        for i, num in enumerate(nums):
            sum = sum + 1 if num == 1 else sum - 1
            if sum not in hashMap:
                hashMap[sum] = i
            else:
                maxCount = max(maxCount, i - hashMap[sum])
        return maxCount
