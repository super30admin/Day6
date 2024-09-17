class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        #if value in array ==0>>runningsum-=1 else>>> runningsum+=1
        #(so controlling both counts from one runninsum variable) . if runningsum==0>> that means subarray till that point is balanced. We will update the maxsize to differnce between index we are at right now and last found same runningsum index. If new rsum value found, just add with corresponding index in map#
        #O(N)
        #O(N)
        if not nums:
            return 0
        mp={}
        mp[0]=-1
        maxsize=0
        rsum=0
        for i in range(len(nums)):
            if nums[i]==0:
                rsum-=1
            else:
                rsum+=1
            if rsum in mp:
                maxsize=max(maxsize,i-mp[rsum])
            else:
                mp[rsum]=i
        return maxsize