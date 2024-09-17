"""Subarray Sum Equals K
Time Complexity: O(n)
Space complexity: O(n)"""
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        runningSumDict = dict()
        runningSumDict[0] = 1
        count = 0
        runningSum = 0
        for i in nums:
            runningSum += i
            compliment = runningSum - k
            if compliment in runningSumDict:
                count += runningSumDict[compliment]
            if runningSum not in runningSumDict:
                runningSumDict[runningSum] = 0
            runningSumDict[runningSum] += 1
        return count