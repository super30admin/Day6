class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        maxLength = 0
        zero = 0
        NumberIndexMap = dict()
        for index, val in enumerate(nums):
            if val == 1:
                zero += 1
            else:
                zero -= 1
            if zero == 0:
                maxLength = index + 1
            if zero in NumberIndexMap:
                if maxLength < index - NumberIndexMap[zero]:
                    maxLength = index - NumberIndexMap[zero]
            else:
                NumberIndexMap[zero] = index
        return maxLength