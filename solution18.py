#Time Complexity:O(n)
#Space Complexity:O(n)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        h={}
        h[0]=-1
        rsum=0
        mlen=0
        for i in range(len(nums)):
            if nums[i]==1:
                rsum=rsum+1
            elif nums[i]==0:
                rsum=rsum-1
            if rsum in h.keys():
                l=i-h[rsum]
                if l>mlen:
                    mlen=l
            else:
                h[rsum]=i
        return mlen