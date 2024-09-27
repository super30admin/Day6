#TC: O(n)
#SC: O(n)
from collections import defaultdict
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        sum_index = 0
        length = 0
        hash_map = { }
        hash_map[0] = -1
        for i in range(len(nums)):
            if nums[i] == 0:
                sum_index += -1
            else:
                sum_index += nums[i]
            if sum_index in hash_map:
                length = max(length, i - hash_map[sum_index])
            else:
                hash_map[sum_index] = i
        return length
                
        