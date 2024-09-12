#TC: O(n)
#SC: O(n) for worst case
class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        hashMap={}
        rSum=0
        max1=0
        start,end=0
        hashMap[0]=-1
        for i in range(0,len(nums)):
            if nums[i]==0: rSum-=1
            else: rSum+=1
            if rSum in hashMap:
                k=i-hashMap[rSum]
                max1=max(max1,k)
            else:
                hashMap[rSum]=i
        return max1
