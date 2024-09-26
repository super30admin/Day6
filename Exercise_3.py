class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        sum = 0
        count = 0
        sum_counter = {0: 1}
        for x in nums:
            sum += x
            count += sum_counter.get(sum - k, 0)
            sum_counter[sum] = sum_counter.get(sum, 0) + 1
        return count