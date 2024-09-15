# Time Compleity: O(n)
# Space compleity: O(1)
# Ran on leetcode: Yes

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if len(nums) == 0: return 0
        sub_dict = {}
        sub_dict.update({0: 1})
        rsum, sub_array_count = 0, 0
        for i in range(len(nums)):
            rsum = rsum + nums[i]
            y = rsum - k
            if y in sub_dict:
                # there is a subarray array with sum k in map
                sub_array_count = sub_array_count + sub_dict.get(y)
            if rsum in sub_dict:
                sub_dict[rsum] = sub_dict.get(rsum) + 1
            else:
                sub_dict.update({rsum: 1})
        return sub_array_count
