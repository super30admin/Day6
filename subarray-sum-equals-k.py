#Time Complexity: O(n)
#Space Complexity: O(n)
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        runningSum = {0:1}
        currSum = 0
        result = 0

        for i in range(len(nums)):
            currSum += nums[i]
            if (currSum-k) in runningSum:
                    result += runningSum[currSum-k]
            if currSum in runningSum:
                runningSum[currSum] +=1
            else:
                runningSum[currSum] = 1
            
        return result
        