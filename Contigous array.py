# Time Complexity = O(n) 
# Space Complexity = O(n) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def findMaxLength(self, nums) -> int:
        max_len = 0
        hash_ = {}
        count = 0
        
        # traversing through whole list
        for i in range(len(nums)):
            
            if nums[i] == 0:
                count -= 1  # decrement 1 if element is 0
            else:
                count += 1 # increment 1 if element is 1
        
            if count == 0:
                max_len = i+1
        
        # update max corresponding to the index 
            if count in hash_:
                max_len = max(max_len, i-hash_[count])
            
            else:
                hash_[count] = i
            
        return max_len