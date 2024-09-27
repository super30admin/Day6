# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
from typing import List
def findMaxLength(nums: List[int]) -> int:
    countsMap = {0:-1}
    count = 0 #runningSUm
    result = 0
    for i in range(len(nums)):
        if nums[i]==0:
            count += -1
        else:
            count += 1

        if count == 0:
            result = i+1
        if count in countsMap:
            result = max(result,i-countsMap[count])
        else:
            countsMap[count]=i
    return result


nums = [0,1,0]

print(findMaxLength(nums))