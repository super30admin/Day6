//time complexity: O(n^2)
//space complexity: O(1)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        arr_len = len(nums)
        maxValue = 0
        for i in range(arr_len):
            countZ = 0
            countO = 0
            for j in range(i, arr_len):
                if nums[j] == 0:
                    countZ += 1
                else:
                    countO += 1
                if countZ == countO:
                    maxValue = max(maxValue, j-i+1)
        return maxValue
