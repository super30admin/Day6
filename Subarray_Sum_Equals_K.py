class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if not nums:
            return
        numsmap = {0: 1}
        rsum, count = 0, 0
        for i in range(len(nums)):
            rsum = rsum + nums[i]
            diff = rsum - k
            if diff in numsmap:
                count = count + numsmap[diff]
            if rsum in numsmap:
                numsmap[rsum] = numsmap[rsum] + 1
            else:
                numsmap[rsum] = 1
        return count
