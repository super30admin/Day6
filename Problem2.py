class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        char_sum = {}
        sum = 0
        char_sum[0] = -1
        length = 0
        
        for i in range(len(nums)):
            if nums[i] == 0:
                sum += - 1
            else:
                sum += 1
            if sum not in char_sum:
                char_sum[sum] = i
            else:
                length = max(length, i - char_sum[sum])
        return length
        
        