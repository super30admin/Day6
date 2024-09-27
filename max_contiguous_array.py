#max_contiguous_array
# time complexity: O(N)
# space complexity: O(1)
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NA
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        total = 0
        sum_dict = {}
        sum_dict[0] = -1
        max_len = 0
        for i in range(0, len(nums)):
            if nums[i] == 1:
                total += 1
            else:
                total -= 1
            if total in sum_dict:
                max_len = max(i - sum_dict[total], max_len)
            else:
                sum_dict[total] = i
        
        return max_len