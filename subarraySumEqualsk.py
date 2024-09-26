#Accepted on leetcode
#Time complexity - O(n) as we traverse entire array
#Space omplexity - O(n) since we are using hashmap

class Solution(object):
    def subarraySum(self, arr, target):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        runningSumDict = dict()
        count = 0
        runningSumDict[0] = 1
        runningSum = 0
        for i in arr:
            runningSum += i
            compliment = runningSum - target
            if compliment in runningSumDict:
                count += runningSumDict[compliment]
            if runningSum not in runningSumDict:
                runningSumDict[runningSum] = 0
            runningSumDict[runningSum] += 1
        return count        