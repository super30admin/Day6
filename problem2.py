# time complexity: O(n)
# space complexity: O(n)

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if len(nums)==1:
            return 0

        prefixMap = {0: -1}     # prefixSum : earliestIndex
        maxValue = 0
        prefixSum = 0

        for i, num in enumerate(nums):
            if num == 0:
                prefixSum -= 1
            else:
                prefixSum += 1
            
            if prefixSum in prefixMap:
                maxValue = max(maxValue, i-prefixMap[prefixSum])
            else:
                prefixMap[prefixSum] = i
        
        return maxValue