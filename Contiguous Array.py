#time complexity- 0(n) and space complexity- 0(n)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if nums == None or len(nums)==0:
            return 0

        rsum=0
        Map={}
        Map[0]=-1
        Max=0

        for i in range(len(nums)):
            if nums[i]==0:
                rsum=rsum-1
            if nums[i]==1:
                rsum = rsum+1
            if rsum not in Map:
                Map[rsum]=i
            else:
                Max=max(Max,i-Map[rsum])
        return Max 