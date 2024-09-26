
# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        dic={}
        dic[0]=1
        counter=0 #no of subarrays
        rsum=0
        if len(nums)==0 or nums==None:
            return 0
        for i in range(len(nums)):
            rsum= rsum+nums[i]
  
            if rsum-k in dic.keys():
                counter=counter+dic[rsum-k]
            if rsum in dic.keys():
                p = dic[rsum]
                dic[rsum]=p+1
                  
            else:
                dic[rsum]=1

        return counter        