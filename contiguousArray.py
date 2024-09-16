# // Time Complexity : O(n) 
# // Space Complexity : O(n)  
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : understanding running sum 

# // Your code here along with comments explaining your approach
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if not nums: return 0
        maxLen = 0
        hashmap = {0:-1}
        rSum = 0
        
        for i in range(len(nums)):
            if nums[i] == 0:
                rSum -= 1
            else:
                rSum += 1
            
            if rSum in hashmap:
                index = hashmap[rSum]
                # storing length of the subarray
                maxLen = max(maxLen,i-index) 
            else:
                hashmap[rSum] = i
        
        return maxLen
            