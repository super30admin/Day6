# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes




class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        dic = {}
        rsum = 0
        maxim = 0
        dic[0]=-1 #default value
        if nums == None or len(nums) == 0:
                return 0
        for i in range(len(nums)):
                if nums[i]==1:
                    rsum=rsum+1
                else:
                    rsum=rsum-1
                if rsum in dic.keys():
                    maxim = max(maxim,i - dic[rsum])
                else:
                    dic[rsum]=i
                    
        return maxim           