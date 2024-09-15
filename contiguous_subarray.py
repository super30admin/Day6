"""
525.
Approach -- using hashmap - to store - rsum=key, idx = value
If 1 is encountered, add 1
If 0 is encountered, subtract 1
compare the length with s_map
return maxLength

TC = O(n)
SC - O(n)
"""

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0:
            return 0

        s_map = {0: -1}
        rSum = 0
        length = 0

        # print(s_map)
        for i in range(len(nums)):
            if nums[i] == 1:
                rSum = rSum + 1
            else:
                rSum = rSum - 1
            if rSum in s_map:
                length = max(length, i - s_map[rSum])
            else:
                s_map[rSum] = i
        return length