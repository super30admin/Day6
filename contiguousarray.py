"""525. Contiguous Array
Time Complexity: O(n)
Space Complexity: O(n)"""
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        maxLength = 0
        sumT = 0
        NumberIndexMap = dict()
        
        for index, val in enumerate(nums):
            if val == 1:
                sumT += 1
            else:
                sumT -= 1
                
            if sumT == 0:
                maxLength = index + 1
                  
            if sumT in NumberIndexMap:
                maxLength = max(maxLength, index - NumberIndexMap[sumT])
            else:
                NumberIndexMap[sumT] = index
        return maxLength
