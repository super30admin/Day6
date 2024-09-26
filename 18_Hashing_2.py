// Time Complexity :O(n)
// Space Complexity :O(n) worst case
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : np
// Your code here along with comments explaining your approach
// my approach is similar to the approach taught in class, using hash map by decrementing on 0 and incrementing on 1.
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        count = 0
        result = 0
        dict_seen = {0: -1}
        for i in range(len(nums)):
            n = nums[i]
            if n == 0:
               count -= 1
            if n == 1:
               count += 1
            if count in dict_seen:                       
               result = max(result, i-dict_seen[count]) 
            else:                     
               dict_seen[count] = i  
        return result