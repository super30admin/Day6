class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        rSum=0
        count=0
        dict1=dict()
        dict1[0]=1
        for num in nums:
            rSum+=num
            if((rSum-k) in dict1.keys()):
                count+=dict1[rSum-k]
            dict1[rSum]=dict1.get(rSum,0)+1
        return count
obj=Solution()
obj.subarraySum([1,1,1],2)