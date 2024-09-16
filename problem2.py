#Time complexity: O(n)
#Space complexity: O(n)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        dic = {}
        dic[0] = -1
        rSum = 0
        maxLength = 0
        for i in range(len(nums)):
            if nums[i] == 1:
                rSum += 1
            else:
                rSum -= 1
            if rSum in dic:
                maxLength = max(maxLength, i-dic[rSum])
            else:
                dic[rSum] = i
        return maxLength