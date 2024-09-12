# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#
#
#

class Solution:
    def subarraySum(self, nums: list[int], k: int) -> int:
        dictu = {0: 1}
        count = 0
        running_sum = 0
        for i in nums:
            running_sum += i
            if running_sum - k in dictu:
                count += dictu[running_sum - k]
            if running_sum in dictu:
                dictu[running_sum] += 1
            else:
                dictu[running_sum] = 1
        return count


check = Solution()
print(check.subarraySum([1, 1, 1], 2))


# class Solution:
#     def subarraySum(self, nums: list[int], k: int) -> int:
#         dictu = {0: 1}
#         count = 0
#         running_sum = 0
#         for i in nums:
#             running_sum += i
#             if running_sum - k not in dictu:
#                 if running_sum in dictu:
#                     dictu[running_sum] += 1
#                 else:
#                     dictu[running_sum] = 1
#             elif running_sum - k in dictu:
#                 count += dictu[running_sum - k]
#                 if running_sum not in dictu:
#                     dictu[running_sum] = 1
#                 else:
#                     dictu[running_sum] += 1
#         return count

#
# check = Solution()
# print(check.subarraySum([1, 1, 1], 2))




