"""
Time complexity :- O(n)
Space compleixty :- O(n)
"""


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hash_map = dict()
        hash_map[0] = -1
        prefix = 0
        max_len = 0
        for i in range(len(nums)):
            num = nums[i]
            if num == 0:
                num = -1
            else:
                num = num
            prefix += num

            if prefix in hash_map:
                max_len = max(max_len, i - hash_map[prefix])
            else:
                hash_map[prefix] = i
        return max_len


