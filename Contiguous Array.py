# // Time Complexity : O(n) 
# // Space Complexity : O(n) 
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        map = dict()
        map[0] = -1
        maxlen = 0
        prefixSum = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                prefixSum -= 1
            else:
                prefixSum += 1
                
            if prefixSum in map:
                length = i-map[prefixSum]
                maxlen = max(maxlen, length)
            else:
                map[prefixSum] = i
        return maxlen
            
        