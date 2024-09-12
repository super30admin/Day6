'''
Approach: Iterate nums and add each element to running sum. If running sum present in dict, add the value of running sum key to result. If running sum is not present, add the running sum and count is set to 1. Return result

Time complexity: O(n)
Space complexity: O(n)

Passes all testcases in leetcode

'''
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        rs = 0
        temp = {}
        temp[0] = 1
        result = 0
        for i in range(len(nums)):
            rs += nums[i]
            
            if (rs-k) in temp:
                result += temp[rs-k]
                
            if rs not in temp:
                temp[rs] = 0 
                
            x = temp[rs] + 1
            temp[rs] = x
            
        return result
                
                
                
            
            
        
