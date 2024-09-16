# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes.
# Any problem you faced while coding this : Arrived at brute force solution. Implemented O(n) solution after discussion in class.
# class Solution:
#     def findMaxLength(self, nums: List[int]) -> int:
#         m = 0
#         for i in range(len(nums)):
#             zeros = 0
#             ones = 0
#             for j in range(i,len(nums)):
#                 if nums[j] == 0:
#                     zeros += 1
#                 else :
#                     ones += 1
#                 if zeros == ones:
#                     m = max(m,j-i+1)
#         return m
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        r_sum = 0
        count = 0
        d = {}
        d[0] = -1
        for i,val in enumerate(nums):
            if val == 0:
                r_sum -= 1
                if r_sum not in d:
                    d[r_sum] = i
                else:
                    count = max(count,i-d[r_sum])
            else:
                r_sum += 1
                if r_sum not in d:
                    d[r_sum] = i
                else:
                    count = max(count,i-d[r_sum])
        return count
