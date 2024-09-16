# Time Complexity :O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach
class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        mySum = 0
        myCount = 0
        sums = {0:1}
        for i in nums:
            #sum till this point
            mySum+=i
            #if in array of sums there is a value that is equal to mySum -k then there is a subbarray that its summation equal k add all of this subarrays
            if (mySum -k) in sums:
                myCount+= sums[mySum -k]
            # if mySum is already in sums add one as this is another point that can some to same point
            if mySum in sums:
                sums[mySum] +=1
            else:
                sums[mySum] = 1
        return myCount