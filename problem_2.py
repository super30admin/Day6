#  Time Complexity : O(n)
#  Space Complexity : O(n)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No

# https://leetcode.com/problems/contiguous-array/
#  Your code here along with comments explaining your approach
#  I created hash map to store running sum and index. 
#  If running sum is already present in hash map then I update result with 
#  max of result and i - running_sum[rs]. 
#  If running sum is not present in hash map then I add running sum and index to hash map. 
#  Finally I return result.

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        running_sum =  {}
        rs = 0
        result = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                rs -= 1
            else:
                rs += 1
            if rs == 0:
                result = max(result, i + 1)
            if rs in running_sum:
                result = max(i - running_sum[rs], result)
            else:
                running_sum[rs] = i
        return result