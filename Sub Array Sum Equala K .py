#time complexity- 0(n) and space complexity- 0(n)
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if nums== None or len(nums) ==0:
            return 0

        count=0
        Map={}
        Map[0] = 1
        rsum =0
        for i in range(len(nums)):
            rsum = rsum+nums[i]
            if (rsum-k) in Map:
                count= count+Map[rsum-k]
        
            if rsum not in Map:
                Map[rsum] =1
            else:
                Map[rsum] +=1
        return count 