"""
Name: Srinidhi Bhat
Time Complexity: O(n)
Space Complexity: O(n)

Did it run on Leetcode: Yes
Logic : Same value must occur on Y-axis at that time, we have reached equal 0's and equal 1's
To get the max_len, always compare the current maximum and the current length
To get the current length subtract current_index and prev_index
"""
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        max_len = 0
        table ={0:-1}
        
        count = 0
        
        for index,num in enumerate(nums):
            if num ==0:
                count-=1
            else:
                count+=1
                
            if count in table:
                max_len = max(max_len, index-table[count])
            else:
                table[count] = index
        return max_len