# Leetcode 560 sum of subarray equals K

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        # running sum approach
        # TC: O(N)
        # SC: O(N)
    
    
    
        count = 0
        curr = 0
        preSum = {0:1}
        
        for i in nums:
            curr += i
            diff = curr - k
            if diff in preSum:
                count += preSum[diff]
                
            if curr in preSum:
                preSum[curr] = 1 + preSum[curr]
            else:
                preSum[curr] = 1
        return count
    
    '''
        one more way of writting the above code - very good 
        c = 0
        curr = 0
        preSum = {0:1}
        
        for i in nums:
            curr += i
            diff = curr - k
            
            c += preSum.get(diff, 0)
            preSum[curr] = 1 + preSum.get(curr, 0)
        
        return c
    
    '''
    
        