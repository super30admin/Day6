"""
// Time Complexity : o(n), where n is the number of elements in nums
// Space Complexity : o(n), size of dictionary
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
"""

from collections import defaultdict

class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        """Running sum"""
        d = defaultdict(int) 
        max_len = 0 # keeping track of max length
        
        r_sum = 0
        
        d[0] = -1 #dummy, storing running sum and its index
        
        for i in range(len(nums)):
            
            if nums[i] == 0:
                r_sum = r_sum - 1 #if zero is encountered, subtract 1
            else:
                r_sum = r_sum + 1 #if one is encountered, add 1
                
            if r_sum in d: #if running sum exists in d
                max_len = max(max_len, i - d[r_sum]) #calculate length by subtracting indices and update max_len accordingly
            else:
                d[r_sum] = i # else add r_sum to d
                         
        return max_len