class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:

        if len(nums) == 1 and k != nums[0]:
            return 0

        count = 0
        sum_ = 0
        dict1 = {0: 1}
        for num in nums:
            sum_ += num
            if sum_ not in dict1:
                dict1[sum_] = 1
            else:
                dict1[sum_] += 1

            if sum_ - k in dict1:
                count += dict1[sum_ - k]
        return count

