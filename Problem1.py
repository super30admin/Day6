class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        running_sum = defaultdict(int)
        summ = 0
        result = 0

        running_sum[0] = 1

        for i, n in enumerate(nums):
            summ += n

            if summ - k in running_sum:
                result += running_sum[summ-k]

            running_sum[summ] += 1
        return result
