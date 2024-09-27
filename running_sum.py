from collections import defaultdict
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        sumDict = defaultdict(int)
        sumDict[0] = 1
        currSum = 0
        result = 0
        for i in nums:
            currSum += i
            diff = currSum - k
            result += sumDict[diff]
            sumDict[currSum] += 1
        return result
