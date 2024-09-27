// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        maximum=0
        cursum=0
        dic=dict()
        dic[0]=-1
        for i in range(len(nums)):
            if nums[i]==1:
                cursum+=-1
            else:
                cursum+=1
            
            if cursum in dic:
                start=dic[cursum]
                end=i
                maximum=max(maximum,end-start)
            else:
                dic[cursum]=i
        return maximum
