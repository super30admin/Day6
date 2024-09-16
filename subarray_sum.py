class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        my_dict={0:1}
        res=0
        rsum=0
        for i in range(0,len(nums)):
            rsum+=nums[i]
            diff=rsum-k
            
            res+=my_dict.get(diff,0)
            my_dict[rsum]=1+my_dict.get(rsum,0)
        
        return res