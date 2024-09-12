#Time complexity: O(n)   
#Space complexity: O(n) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        # before starting, sum 0 has occured once, handling edge case
        mapping = {0:1}
        rsum = 0
        result = 0 
        for num in nums:
            rsum += num
            # if number compliment in mapping, by z=x-y logic, where z is target(k) and x is rsum
            #take the number of times complement has
            # occurred and add it to the result
            if rsum-k in mapping:
                result += mapping[rsum-k]
            mapping[rsum] = mapping.get(rsum,0) + 1
        return result
                