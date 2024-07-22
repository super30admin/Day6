#Time complexity O(n)
#Space complexity O(n)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:

        runningSum = {0: -1}
        currSum = 0
        result = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                currSum -=1
            else:
                currSum +=1
            if currSum in runningSum:
                result = max(result, i-runningSum[currSum])
            else:
                runningSum[currSum] = i
        return result
            
        
