class Solution:
    def findMaxLength(self, nums: List[int]) -> int:

        running_sum = {}
        summ = 0
        result = 0

        for i, n in enumerate(nums):
            if n == 0:
                summ -= 1
            
            elif n == 1:
                summ += 1
            
            if summ == 0:
                result = max(result, i + 1)
            
            else:
                if summ in running_sum:
                    result = max(result, i - running_sum[summ])
                else:
                    running_sum[summ] = i
        return result
