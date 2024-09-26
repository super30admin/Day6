'''
Approach: running sum pattern
TC: O(n)
SC: O(n)
'''


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        dict1 = {0: 1}
        count = 0
        running_sum = 0

        for i in range(len(nums)):
            running_sum += nums[i]

            if running_sum - k in dict1:
                count += dict1[running_sum - k]

            if running_sum in dict1:

                dict1[running_sum] += 1
            else:
                dict1[running_sum] = 1
        return count
