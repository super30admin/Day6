class Solution:
    def findMaxLength(self, nums: List[int]) -> int:

        nums = [-1 if num == 0 else num for num in nums]  

        sum_dict = {0: -1} 
        previous_sum = 0
        max_length = 0

        for i in range(len(nums)):
            previous_sum += nums[i]

            if previous_sum in sum_dict:
                max_length = max(max_length, i - sum_dict[previous_sum])
            else:
                sum_dict[previous_sum] = i 

        return max_length
