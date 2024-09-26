#Time Complexity: O(n)
#Sapce Complexity : O(n)

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        countFreq =  {}
        subArrCount = 0
        currSum = 0
        countFreq[0] = 1
        print(countFreq)
        for num in nums:
            currSum += num
            if currSum - k in countFreq:
                subArrCount += countFreq[currSum-k]
            if currSum in countFreq:
                countFreq[currSum] += 1
            else:
                countFreq[currSum] = 1
        return subArrCount
