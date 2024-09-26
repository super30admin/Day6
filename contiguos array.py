class Solution:
    def findMaxLength(self, nums: List[int]) -> int:

        while len(nums) == 0:
            return 0

        dict1 = {}
        count = 0
        sub_arr = 0
        for i in range(len(nums)):
            if nums[i] == 1:
                count += 1
            else:
                count -= 1
            if count == 0:
                sub_arr = i + 1

            if count not in dict1:
                dict1[count] = i
            else:
                sub_arr = max(sub_arr, i - dict1[count])
        return sub_arr

#TC = o(n)