from collections import defaultdict
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if len(nums)<=1:
            return 0
        dict_val = defaultdict(int)
        sum_val = 0
        ans = 0
        # if nums[0]:
        sum_val = 0
        dict_val[0] = -1
        # else:
        #     sum_val = -1
        #     dict_val[-1] = -1
        for index, val in enumerate(nums):
            if not val:
                sum_val-=1
            else:
                sum_val += 1
            if sum_val in dict_val:
                ans = max(ans, index - dict_val[sum_val])
            else:
                dict_val[sum_val] = index
            # print(dict_val)
        return ans