// Time Complexity :o(n)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NO
class Solution(object):
    def subarraySum(self, nums, k):
        count=0
        runsum=0
        d={}
        d[0]=1
        for i in nums:
            runsum+=i
            diff=runsum-k
            if diff in d:
                count+=d[diff]
            if runsum not in d:
                d[runsum]=1
            else:
                d[runsum] +=1
        return count
            
