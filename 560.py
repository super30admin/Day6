// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hashmap = {}
        total_sum = 0
        count = 0
    
        
        for i in range(len(nums)):
            total_sum += nums[i]
            if total_sum == k:
                count += 1
            if total_sum - k in hashmap:
                count += hashmap[total_sum - k]
            
            if not total_sum in hashmap:
                hashmap[total_sum] =  0
            
            hashmap[total_sum] += 1
                
            
        return count
                
        

                