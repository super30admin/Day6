'''https://leetcode.com/problems/subarray-sum-equals-k/

Given an array of integers nums and an integer k, 
return the total number of subarrays whose sum equals to k.

Example:
Input: nums = [1,1,1], k = 2
Output: 2

Example:
Input: nums = [3, 4, 7, 2, -3, 1, 4, 2, 0, 1], k = 7
Output: 7
'''

# Time Complexity : O(N) where N is len of input string s
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def subarraySum(self, nums: 'list[int]', k: int) -> int:
        '''
        running sum pattern:
        index = 0  1  2  3  4  5   6
        nums=  [1, 2, 3,|4, 5, 6|, 7]
        rsums:0[1, 3, 6, 10,15,21,28]
        
        sum of nums[3: 6] = sum(4+5+6) = 15
        From rsums, we can get same result with - 
        rsums[5] - rsums[2]
        => 21 - 6
        => 15
        
        using this pattern to solve problem.
        For current rsum at index i, 
        check if some previous rsum exists 
        such that target = current_rsum - prev_rsum
        => check for current_rsum-target exists
        
        Use hashmap to store {running_sum : # of prev rsums encountered}
        '''
        if nums is None or len(nums) == 0: return 0
        
        rSum = 0 # running sum
        total = 0 # result
        #Map {rSum: frequency}
        # init with {0, 1} => rSum == 0 encountered first time (before start)
        freqMap = {0: 1} 
        
        for n in nums:
            rSum += n
            if rSum-k in freqMap:
                total += freqMap[rSum-k]
            
            freqMap[rSum] = freqMap[rSum]+1 if rSum in freqMap else 1
        
        return total
        
