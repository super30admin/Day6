# TC : O(n)
# SC : O(n)
class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        partial_sum = 0		
        table = { 0: -1}        
        max_length = 0
        
        for i, number in enumerate(nums):
            if number:
                partial_sum += 1
            else:
                partial_sum -= 1
            if partial_sum in table:
                
                max_length = max( max_length, ( i - table[partial_sum] ))
                
            else:
                table[ partial_sum ] = i
                
        return max_length
        