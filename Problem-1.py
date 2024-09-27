class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:

        mapSum={}
        rsum=0; count=0
        mapSum[0]=1
        for i in range(len(nums)):
            rsum+=nums[i]
            compliment = rsum-k
            if compliment in mapSum:
                count+=mapSum[compliment]
            if rsum not in mapSum:
                mapSum[rsum]=1
            else:
                mapSum[rsum]+=1

        return count
            
