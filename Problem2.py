#Using running Sum pattern/ prefix Sum
# 525. Contiguous Array
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hash_set = {}
        hash_set[0] = -1
        max_len = 0
        rSum = 0

        for i in range(len(nums)):
            if nums[i] == 0:
                rSum -= 1
            else:
                rSum += 1

            if rSum in hash_set:
                max_len = max(max_len, i - hash_set[rSum])
            else:
                hash_set[rSum] = i
        return max_len



        