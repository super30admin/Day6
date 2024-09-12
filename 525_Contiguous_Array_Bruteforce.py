# Time Complexity : O(n*n) [n = length of the input list]
# 
# Space Complexity : O(1)
# 
# Did this code successfully run on Leetcode : Partially(TLE)
# 
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
# 1. Iterate over all the index and maintain count of zeros and ones for the possible contiguous array
# 2. Whenever the count_1 equates with count_0, the max_length is updated by taking the difference index j and i
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        max_length = 0
        for i in range(len(nums)):
            count_1, count_0 = 0, 0
            if nums[i] == 1:
                count_1 = 1
            else:
                count_0 = 1
            for j in range(i+1, len(nums)):
                if nums[j] == 1:
                    count_1 += 1
                else:
                    count_0 += 1
                if count_1 == count_0:
                    max_length = max(max_length, j-i + 1)
        return max_length