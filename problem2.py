# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach
# Maintain a hashmap of the relative count of 1s and 0s
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        count_map = {0:-1}
        count = 0
        max_len = 0
        for r, num in enumerate(nums):
            if num == 1:
                count += 1
            else:
                count -= 1
            if count in count_map:
                max_len = max(max_len, r - count_map[count])
            else:
                count_map[count] = r
        
        return max_len