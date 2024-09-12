#Time complexity: O(n)  
#Space complexity: O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # Condition to incorporate the first element in the longest subarray calculation
        #map to store sum with index
        mapping = {0:-1}
        maxlen = 0
        rsum = 0
        for idx,num in enumerate(nums):
            if num == 1:
                rsum +=1
            if num == 0:
                rsum -= 1
            # z=x-y logic, x is rsum, y is sum from mapping, if x and y are same, z is 0
            # this implies equal number of 0's and 1's, so we consider that subarray
            if rsum in mapping:
                len_subarray = idx - mapping[rsum]
                maxlen = max(len_subarray,maxlen)
            else:
                mapping[rsum] = idx
            
        return maxlen
            