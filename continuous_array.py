#timecomplexity = o(n)
#space_complexity = o(n)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if nums == None or len(nums)==0:
            return 0
        rsum = 0
        d ={}
        d[0] = -1
        Max =0
        for i in range(len(nums)):
            if nums[i] ==0:
                rsum = rsum - 1
            else:
                rsum = rsum + 1
            if rsum in d:
                Max = max(Max, i - d[rsum])
            else:
                d[rsum] = i
        return Max