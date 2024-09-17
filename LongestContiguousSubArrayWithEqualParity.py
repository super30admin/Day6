# Time Complexity : O(N) where N = len(nums)

# Space Complexity : O(N) 
# Case 1: All nums are 0. Size(Map) = N + 1
# Case 2: All nums are 1. Size(Map) = N + 1
# Case 3: Some are 0, sum are 1. Size(Map) < N + 1

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : I had a tough time figuring out why we would not update the index. 


# Your code here along with comments explaining your approach

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        d = {} # key = parity, value = idx
        
        d[0] = -1
        
        parity = 0
        maxLen = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                parity -= 1
            else:
                parity += 1
            
            if parity in d:
                maxLen = max(maxLen, i - d[parity]) # Do not update index because of the i, j, k diagram.
            else:
                d[parity] = i
        
        return maxLen