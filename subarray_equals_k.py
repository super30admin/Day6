#// Time Complexity : O(n)
#// Space Complexity : O(n)
#// Did this code successfully run on Leetcode : Yes
#// Any problem you faced while coding this : None


#// Your code here along with comments explaining your approach:
#For this problem we will start by calculating the cumulative sum of the array and store the cumulative sum in the dictionary with their #frequencies.for every iteration of calculating the cumulative sum we see whether cumulativesum-targetsum is present in the dictionary or #not.If yes it means that we have a sub array of sum equal to targetsum.In this way we take the count of all the sub arrays present in #the array with su equal to the target sum.




class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        d=dict()
        d[0]=1
        rsum=0
        count=0
        for i in range(len(nums)):
            rsum=rsum+nums[i]
            if rsum-k in d:
                count=count+d[rsum-k]
            if rsum not in d:
                d[rsum]=1
            else:
                d[rsum]=d[rsum]+1
        return count