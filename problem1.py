#time: O(n)
#space: O(n)
#Leetcode : Accepted
#Problems: was a bit tricky to grasp why we need to maintain dict of runningsum
#and not complement

class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        #initialize
        runningsum = 0
        target = k
        d = {0:1}
        count = 0

        for i in range(len(nums)):
            #maintain running sum
            runningsum += nums[i]
            complement = runningsum - target
            if complement in d:
                #this signifies that we have hit the target value
                count += d[complement]

                #this keeps a record of the running sum so we know when we hit
                #that value again
            if runningsum in d:
                d[runningsum] += 1
            else:
                d[runningsum] = 1

        return count
