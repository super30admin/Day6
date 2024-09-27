#// Time Complexity : O(n)
#// Space Complexity : O(n)
#// Did this code successfully run on Leetcode : Yes
#// Any problem you faced while coding this : None


#// Your code here along with comments explaining your approach:
#The logic used for this problem is quite similar to the one that we have used for subarray_equals_to_k.Only difference is in intialising the intial value for index 0.since here we are going to store the indices of the distinct cumulativesum we use -1 for the cumulativesum '0'.since the data contains only 0 and 1, we have calculated cumulativesum as cumulativesum+1 if the value is 1 else as cumulativesum-1 for '0'.we also store the first occurence of the distinct values of the cumulativesum in a dictionary along with their indices.while calculating the cumulativesum the pattern observed was the array between two repeated cumulativesum has equal number of zeros and ones.SInce we need to find the maximum we have taken a variable maxi and then compared with all the resultant arrays which are havign equal number of zeros and ones to get the maximum length of the contiguous arrays.




class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        rsum=0
        d=dict()
        d[0]=-1
        maxi=0
        for i in range(len(nums)):
            if nums[i]==0:
                rsum=rsum-1
            else:
                rsum=rsum+1
            if rsum not in d:
                d[rsum]=i
            else:
                maxi=max(maxi,i-d[rsum])
        return maxi
        