# Time Complexity : O(n) [n = length of the input list]
# 
# Space Complexity : O(n) [n+1 to be precise -> size of cumaltive_sum map]
# 
# Did this code successfully run on Leetcode : Yes
# 
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
# 1. If 1 is encountered while traversal, the sum is incremented by 1 otherwise decremented by 1
# 2. Store the cumaltive sum in a map with sum as the key and the index at which the sum is encountered as value.
# 3. If the same sum is encountered again, then we fetch the initial index for that sum and update the max_length if the difference between the current index and initial index exceeds max_length 
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        max_length = 0
        s = 0
        cumalative_sum = {0:-1} # This ensures that if the sum 0 is encountered during the traversal the initial index is available to update the max_length
        for i, num in enumerate(nums):
            s += 1 if num == 1 else -1
            if s in cumalative_sum:
                max_length = max(max_length, i - cumalative_sum[s])
            else:
                cumalative_sum[s] = i
        return max_length