class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if(nums==None or len(nums)==0):
            return 0
        gMax=0
        hmap={0:-1}
        rSum=0
        for i in range(len(nums)):
            if(nums[i] == 0):
                rSum-=1
            else:
                rSum+=1
            if(rSum in hmap):
                tlen=i-hmap[rSum]
                gMax=max(tlen,gMax)
            else:
                hmap[rSum]=i
        return gMax
                
                
            
        