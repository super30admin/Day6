"""
// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
"""
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        
        hashmap = {}
        count = 0
        length = 0
        
        hashmap[0] = -1
        
        for i in range(len(nums)):
            
            if nums[i] == 0:
                count -= 1
            else:
                count += 1
            
            if count not in hashmap:
                hashmap[count] = i
            else:
                length = max(length, i - hashmap[count])
                
        return length
