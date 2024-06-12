class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        rSum=0
        rSumToIndex={}
        rSumToIndex[0]=-1
        longestSubarray=0
        
        for i in range(len(nums)):
            if(nums[i]==1):
                rSum=rSum+1
            else:
                rSum=rSum-1
            
            if rSum in rSumToIndex:
                subArrayValue=i-rSumToIndex[rSum]
                longestSubarray=max(longestSubarray,subArrayValue)
            else:
                rSumToIndex[rSum]=i
        return longestSubarray
        