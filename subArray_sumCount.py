class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        :time complexity:O(n)
        :space complexity:O(n)
        """
        runningSum=0
        count=0
        hashMap={}
       # initialise hashmap with running sum as key: zero and number of times it occured as value : 1
        hashMap = {0:1}
        for i in range(len(nums)):
            runningSum=runningSum+nums[i]
            if (runningSum-k) in hashMap:
                count=count+ hashMap[runningSum-k]
            if runningSum in hashMap:
                hashMap[runningSum]=hashMap[runningSum]+1
            else:
                hashMap[runningSum]=1
        return count
        