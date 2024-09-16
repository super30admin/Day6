class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        if(len(nums)==0 or nums==None):
            return 0
        
        rSum=0
        hmap={0:1}
        count=0
        for i in range(len(nums)):
            rSum+=nums[i]
            if(rSum-k in hmap):
                count+=hmap[rSum-k]
            if(rSum in hmap):
                hmap[rSum]+=1
            else:
                hmap[rSum]=1
        return count
            
        