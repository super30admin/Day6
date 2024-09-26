class Solution:#time O(n) and space O(1)
    def findMaxLength(self, nums: List[int]) -> int:
        ma={}
        ma[0]=-1
        rsum=0
        mx=0
        for i in range(len(nums)):
            if nums[i]==0:rsum-=1
            else : rsum+=1
            if rsum in ma:mx=max(mx,i-ma[rsum])
            else:ma[rsum]=i
        return mx
