// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        sum=0
        maxim=0
        di={}
        for i in range(len(nums)):
            if nums[i]==0: #adding sum for every '0'
                sum+=1
            else: # decreasing sum for every '1'
                sum-=1
            if sum==0: # if sum==0 then it means, until that point we have a valid contiguous sub array
                maxim=i+1
            if sum in di: # if sum already in di, update maxim if its the largest sub array
                maxim=max(i-di[sum],maxim)
            else:
                di[sum]=i

        return maxim # return length of maximum sub-array
