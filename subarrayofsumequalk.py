from collections import defaultdict
from typing import List


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if nums is None or len(nums) == 0: return -1
        rsum, sum_frequency, count = 0, defaultdict(int), 0
        sum_frequency[0] = 1
        for element in nums:
            rsum += element
            if rsum - k in sum_frequency.keys():
                count += sum_frequency[rsum - k]
            else:
                sum_frequency[rsum] += 1
        return count
