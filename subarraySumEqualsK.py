# // Time Complexity : O(n) Worse Case - O(n^2)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :
#
#
# // Your code here along with comments explaining your approach

from collections import defaultdict
class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """

        dict_runningSum = defaultdict(lambda : 0)
        count = 0
        runningSum = 0

        for i in nums:

            runningSum += i
            diff = runningSum - k

            if runningSum == k:
                count += 1

            if diff in dict_runningSum:
                count += dict_runningSum[diff]

            dict_runningSum[runningSum] += 1


        return count

