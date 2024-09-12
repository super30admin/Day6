class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        dicta={0:1}
        count=0
        rsum=0
        for i in range(len(nums)):
            rsum+=nums[i]
            if rsum-k in dicta:
                count+=dicta[rsum-k]
            if rsum in dicta:
                dicta[rsum]+=1
            else:
                dicta[rsum]=1
        return count