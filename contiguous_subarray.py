# O(N) TIME AND O(N) SPACE WHERE N IS LEN(NUMS)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        sums = {0:-1}
        max_len = 0
        current_sum = 0
        for i,num in enumerate(nums):
            if num == 0:
                current_sum += 1
            else:
                current_sum -= 1
            
            if current_sum in sums:
                max_len = max(max_len, i - sums[current_sum])
            else:
                sums[current_sum] = i
        return max_len
            