'''
Time Complexity: O(n) where n is length of the list
Space Complexity: O(n) where n is length of the list
Run on Leetcode: YES
'''
class Solution:
    def findMaxLength(self, nums: list[int]) -> int:
        sMap = {}
        sMap[0] = -1
        rSum = 0
        result = 0
        for index in range(len(nums)):
            if nums[index] == 0:
                rSum -= 1
            else:
                rSum += 1
            if rSum in sMap.keys():
                result = max(result, index - sMap[rSum])
            else:
                sMap[rSum] = index
        return result