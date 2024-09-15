# Time Compleity: O(n)
# Space compleity: O(1)
# Ran on leetcode: Yes


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if len(nums) == 0: return 0
        bin_dict = {}
        bin_dict.update({0:-1})
        rsum, max_length= 0,0
        for i in range(len(nums)):
            if nums[i] == 0:
                rsum = rsum-1
            else:
                rsum = rsum + 1
            if rsum in bin_dict:
            #there is a balanced array with stored index in map
                curr_len = i - bin_dict.get(rsum)
                if curr_len>max_length:
                    max_length = curr_len
            else:
                bin_dict.update({rsum:i})
        return max_length

