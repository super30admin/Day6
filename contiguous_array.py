# Time Complexity: O(n)
# Space Complexity: O(n)
# Ran on Leetcode: Yes

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if not len(nums):
            return 0
        m = 0
        rsum = 0
        dic = {0: -1}
        for i in range(len(nums)):
            rsum = rsum + 1 if nums[i] == 1 else rsum - 1
            if dic.get(rsum) != None:
                m = max(i - dic[rsum], m)
            else:
                dic[rsum] = i
            
        return m
        