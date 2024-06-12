class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        rSumToNoOfTimesItCame={}
        rSum=0
        rSumToNoOfTimesItCame[0]=1
        noOfSubArrays=0
        for i in range(len(nums)):
            rSum=rSum + nums[i]
            
            noToFindInDict=rSum-k
            if noToFindInDict in rSumToNoOfTimesItCame:
                noOfSubArrays=noOfSubArrays+rSumToNoOfTimesItCame[noToFindInDict]

            if rSum in rSumToNoOfTimesItCame:
                rSumToNoOfTimesItCame[rSum]=rSumToNoOfTimesItCame[rSum]+1
            else:
                rSumToNoOfTimesItCame[rSum]=1
                
        return noOfSubArrays