# Time Complexity O(n)
# Space Complexity O(n). If all elements are 0 or 1
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        maxLen = 0
        hash_map = {}
        hash_map[0] = -1
        _sum = 0
        for index, each in enumerate(nums):
            _sum += -1 if each == 0 else 1

            if _sum in hash_map:
                _len = index - hash_map[_sum]

                maxLen = max(maxLen, _len)
            else:
                hash_map[_sum] = index

        return maxLen