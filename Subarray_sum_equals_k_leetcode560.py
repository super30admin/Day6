class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        # Time complexity : O(n), Space Complexity : O(n)
        map_nums = {0:1}  # this is sum_num/diff = 0 once ie. start of nums
        sum_nums = 0
        count = 0
        for i in range(len(nums)):
            sum_nums += nums[i]
            diff = sum_nums - k
            if diff in map_nums:
                count += map_nums[diff]
            if sum_nums not in map_nums:
                map_nums[sum_nums] =1
            elif sum_nums in map_nums:
                map_nums[sum_nums] +=1
        return count