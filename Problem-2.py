'''
    Time Complexity: O(n)
    Space Complexity: O(n)
    Approach: Calculate the running sum such that -1 if 0 and +1 if 1. 
    Maintain a hashmap recording the first occurence of each running sum. 
    If running sum has occurred before, calculate the length, if max set it.
'''
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        rsumMap = {0: -1} #rSum -> First occurrence index
        maxLength = 0 
        rSum = 0

        for i in range(len(nums)): 
            if nums[i] == 0:
                rSum -= 1
            else:
                rSum += 1

            if rSum not in rsumMap:
                rsumMap[rSum] = i
            else:
                length = i - rsumMap[rSum]
                maxLength = max(length, maxLength)

        return maxLength