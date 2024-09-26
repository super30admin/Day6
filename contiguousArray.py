// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        curr_sum = 0
        max_length = 0
        
        hashMap = {}
        hashMap[0] = -1
        
        for i in range(len(nums)):
            if nums[i] == 1:
                curr_sum += 1
            else:
                curr_sum = curr_sum-1
                
            if curr_sum not in hashMap:
                hashMap[curr_sum] = i
            else:
                max_length = max(max_length, i-hashMap[curr_sum])
            
        return max_length
        