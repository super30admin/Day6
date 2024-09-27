# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
from typing import List
def subarraySum(nums: List[int], k: int) -> int:
    runningSum = 0
    subArrayCount = 0
    runningSumCountMap = {0:1}
    
    for i in range(len(nums)):
        runningSum += nums[i]
        
        diff = runningSum - k
        if (diff) in runningSumCountMap:
            subArrayCount += runningSumCountMap[diff]
        
        runningSumCountMap[runningSum] = runningSumCountMap.get(runningSum,0) + 1
                    
    return subArrayCount

nums = [1,1,1]
k = 2

print(subarraySum(nums, k))