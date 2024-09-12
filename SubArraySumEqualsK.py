#TC: O(n)
#SC: O(n) for worst case
class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        rsum=0
        counter=0
        hm={}
        hm[0]=1
        for i in range(0,len(nums)):
            rsum=rsum+nums[i]
            if rsum-k in hm:
                    counter+=hm[rsum-k]
            if rsum in hm:
                hm[rsum]+=1
                
            else:
                hm[rsum]=1
        return counter
