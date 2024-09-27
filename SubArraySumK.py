#Time Complexity : O(n)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode : YES
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        d = dict()
        r_sum = 0
        d.update({r_sum: 1})
        max_count = 0
        for i in range(0, len(nums)):
            r_sum = r_sum + nums[i]

            x = r_sum - k
            if x in d:
                max_count = max_count + d.get(x)
            if r_sum in d:
                d.update({r_sum: d.get(r_sum) + 1})
            else:
                d.update({r_sum: 1})
        return max_count
