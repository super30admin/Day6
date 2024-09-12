'''https://leetcode.com/problems/contiguous-array/
Given a binary array nums, return the maximum length of a 
contiguous subarray with an equal number of 0 and 1

Input: nums = [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray 
with equal number of 0 and 1.
'''

# Time Complexity : O(N) where N is len of nums
# Space Complexity : O(N) (worst case: [1, 1, 1, 1, 1, 1, 1,..,0,0,0])
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def findMaxLength(self, nums: 'list[int]') -> int:
        # use running sum technique
        max_len = 0
        current_sum = 0 # +1 if num==1, and -1 if num==0
        
        # Map to store the first index of a new current_sum recorded. 
        # Ex: when was the first time we got current_sum='x' ?
        # Init by (0:-1) as initially current_sum=0 and index=-1
        count_to_index = {0: -1}
        
        for i, n in enumerate(nums):
            current_sum = current_sum+1 if n==1 else current_sum-1
            if count_to_index.get(current_sum) is None:
                count_to_index[current_sum] = i
            else:
                subarr_len = i-count_to_index[current_sum]
                if subarr_len > max_len:
                    max_len=subarr_len
        
        return max_len
                
            
        
        