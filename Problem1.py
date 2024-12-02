class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        rsum = 0
        smap = {0: 1}
        count = 0

        for idx, val in enumerate(nums):
            rsum += nums[idx]
            if (rsum - k) in smap:
                count += smap[rsum - k]
            if rsum not in smap:
                smap[rsum] = 1
            else:
                smap[rsum] += 1
        return count
