#Time complexity: O(n)
#Space complexity: O(n)
#Leetcode: Yes

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0

        max_length = 0
        running_sum = 0
        rsum_map = {0:-1}

        for i in range(len(nums)):
            if nums[i] == 0:
                running_sum -=1
            elif nums[i] == 1:
                running_sum +=1
            if running_sum in rsum_map:
                max_length = max(max_length,i-rsum_map[running_sum])
            else:
                rsum_map[running_sum] = i
        return max_length