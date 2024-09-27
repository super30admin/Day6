// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        dic=dict()
        dic[0]=1
        cursum=0
        cnt=0
        for i in nums:
            cursum+=i
            if cursum-k in dic:
                cnt+=dic[cursum-k]
            if cursum in dic:
                dic[cursum]+=1
            else:
                dic[cursum]=1
        return cnt
