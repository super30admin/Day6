# time complexity: O(N)
# space complexity: O(1)
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NA

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        sum_dict = {}
        total = 0
        k_count = 0
        sum_dict[0] = 1
        for i in range(0, len(nums)):
            total += nums[i]
            if (total-k) in sum_dict:
                k_count += sum_dict.get(total-k)
            sum_dict[total] = sum_dict.get(total, 0) + 1
        
        return k_count
            