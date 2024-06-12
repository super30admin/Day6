# Time Complexity : O(n) 
# Space Complexity : O(n) 
# Did this code successfully run on Leetcode : yes	
# Any problem you faced while coding this : Followed approach from the class 
#Subarray Sum Equals K
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        # dictionary of runningsum , count
        hashMap = dict()
        hashMap[0] = 1
        count = 0
        runningSum = 0

        for i in range(len(nums)):
            runningSum += nums[i]
            if (runningSum - k) in hashMap.keys():
                count += hashMap[runningSum -k] 

            hashMap[runningSum] = hashMap.setdefault(runningSum,0) +1

        return count