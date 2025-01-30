#Time : O(n)
# Space: O(n) when all 0/1s
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        rSum = 0
        longestArrLen = 0
        map = {0: -1}
        for i in range(0, len(nums)):
            if nums[i] == 0:
                rSum += -1
            if nums[i] == 1:
                rSum += 1
            if rSum in map:
                longestArrLen = max(longestArrLen, i - map.get(rSum))
            else:
                map[rSum] = i
        return longestArrLen

# Brut force
# Time O(n^2)
# space O(1)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        rSum = 0
        longestArrLen = 0
        for i in range(0, len(nums)):
            count_0 = 0
            count_1 = 0
            for j in range(i, len(nums)):
                if nums[j] == 0:
                    count_0 += 1
                else:
                    count_1 += 1
                if count_0 == count_1:
                    longestArrLen = max(longestArrLen, j-i+1)
        return longestArrLen