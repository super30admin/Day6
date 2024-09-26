class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return False
        d={}
        runsum=0
        maxlen=0
        d[0]=-1
        for i in range(0,len(nums)):
            runsum=runsum-1 if nums[i]==0 else runsum+1
            #if nums[i]==0:
             #   runsum-=1
            #else:
             #   runsum+=1
            if runsum not in d:
                d[runsum]=i
            else:
                maxlen=max(i-d[runsum],maxlen)
        return maxlen
            