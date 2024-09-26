#Time Complexity : O(N) where N is the numbers present in the list
#Space Complexity : O(N) for using one hashmap
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : Yes, need to go through the solution, The solution that I was stick into was O(N^2) solution and using one hashmap

#Your code here along with comments explaining your approach


class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        d={}
        sum=0
        count=0
        d[0]=1
        for i in range(len(nums)): 
            sum+=nums[i]
            if sum-k in d: 
                count+=d[sum-k]
            d[sum]=d.get(sum,0)+1    
        return count    