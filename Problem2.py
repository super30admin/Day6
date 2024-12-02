class Solution:
    def findMaxLength(self, nums: List[int]) -> int:

        if len(nums) == 0:
            return 1
        # if len(nums)==1:
        #     return 1

        smap = {0: -1}
        output = 0
        rsum = 0
        for idx, val in enumerate(nums):
            if nums[idx] == 0:
                rsum -= 1
            else:
                rsum += 1
            if rsum in smap:
                output = max(output, idx - smap[rsum])
            else:
                smap[rsum] = idx
        return output
