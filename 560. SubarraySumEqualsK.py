from typing import List


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if len(nums) == 0:
            return 0
        if len(nums) == 1 and k == nums[0]:
            return 1
        hash1 = {0:1}
        count = 0
        rsum = 0
        for i in range(len(nums)):
            rsum = rsum + nums[i]
            if (rsum - k) in hash1:
                count = count + hash1[rsum - k]
            hash1[rsum] = hash1.get(rsum, 0) + 1
        return count
            

