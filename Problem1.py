'''
Time Complexity: O(n) where n is length of the list
Space Complexity: O(n) where n is length of the list
Run on Leetcode: YES
'''
class Solution:
    def subarraySum(self, nums: list[int], k: int) -> int:
        sMap = {}
        sMap[0] = 1
        result = 0
        rSum = 0
        for index in range(len(nums)):
            rSum += nums[index]
            if rSum - k in sMap.keys():
                result += sMap[rSum - k]
            if rSum in sMap.keys():
                sMap[rSum] += 1
            else:
                sMap[rSum] = 1
        return result