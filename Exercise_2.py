
     # 525. Contiguous Array

    # Time Complexity : O(n)
    # Space Complexity : O(1)
    # Did this code successfully run on Leetcode : Yes
    # Any problem you faced while coding this : No
    
class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_value = 0
        curr_summ = 0
        hash_table = {0:-1}
        
        
        for i in range(len(nums)):
            if nums[i] == 1:
                curr_summ += 1
            else:
                curr_summ -= 1
                
            if curr_summ not in hash_table:
                hash_table[curr_summ] = i
            else:
                max_value = max(i - hash_table.get(curr_summ), max_value)
            
        return max_value