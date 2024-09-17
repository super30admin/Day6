class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        dict = {}
        dict[0] = -1
        maxlen = 0
        sum = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                sum -= 1
            else:
                sum += 1
            if sum in dict:
                maxlen = max(maxlen,i-dict[sum])
            else:
                dict[sum] = i
                
        return maxlen