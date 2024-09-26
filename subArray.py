// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        curr_sum = 0
        
        hashMap = {}
        for i in range(len(nums)):
            curr_sum += nums[i]
            if curr_sum == k:
                count += 1
            
            if curr_sum-k in hashMap:
                count += hashMap[curr_sum-k]
            
            if curr_sum not in hashMap:
                hashMap[curr_sum] = 1
            else:
                hashMap[curr_sum] += 1
                
        return count
                
                
            
        