# // Time Complexity : O(N)
# // Space Complexity : O(N)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach

# Input: nums = [1,1,1], k = 2
# Output: 2

# Input: nums = [1,2,3], k = 3
# Output: 2


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
        
        