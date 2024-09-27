// Time Complexity : o(n)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution(object):
    def findMaxLength(self, nums):
        diff=0
        count=0
        d={}
        d[0]=-1
        for i in range(len(nums)):
            if nums[i]==1:
                diff+=1
            else:
                diff-=1
            if diff not in d:
                d[diff]=i
            else:
                count=max(count,i-d[diff])
        return count
                
