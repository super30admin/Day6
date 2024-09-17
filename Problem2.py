#Time Complexity - O(n)
#Space Complexity - O(n) 

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        dict = {}
        dict[0] = -1
        maxLen = 0
        sum = 0
        
        for x in range(len(nums)):
            sum += 1 if nums[x] == 1 else -1
            if sum in dict:
                maxLen = max(maxLen, x - dict[sum])
            else:
                dict[sum] = x
        
        return maxLen