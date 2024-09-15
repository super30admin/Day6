class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        :time complexity: O(n)
        :space complexity : O(n)
        """
      
        # hashmap with key as running sum and value as index
        hashMap = {0:-1}
        runningSum=0
        maxA=0
        for index, num in enumerate(nums):
            # if element is zero, add -1 to running sum
            if nums[index]==0:
                runningSum=runningSum-1
            # if element is one, add +1 to running sum    
            else:
                runningSum=runningSum+1
            # check if running sum as key in hash map    
            if runningSum in hashMap:
                maxA = max(maxA, index-hashMap[runningSum])
            else:
                hashMap[runningSum] = index
        return maxA