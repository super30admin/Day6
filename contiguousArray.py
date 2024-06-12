class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        count=0
        rSum=0
        dict1=dict()
        dict1[0]=-1
        for i in range(len(nums)):
            if nums[i]==0:
                rSum=rSum-1
            else:
                rSum=rSum+1
            if rSum in dict1.keys():
                if(count<i-dict1[rSum]):
                    count=i-dict1[rSum]
            else:
                dict1[rSum]=i
        return count