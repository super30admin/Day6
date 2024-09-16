"""
Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this: none
"""

class Solution:
    def subarraySum(self, nums, k):
        if not nums or len(nums) == 0:
            return 0
        
        sum_map = {0 : 1}
        count = 0
        rsum = 0
        
        for i in range(len(nums)):
            rsum += nums[i]
            comp_sum = rsum - k
            if sum_map.get(comp_sum) != None:
                count += sum_map.get(comp_sum)
            if sum_map.get(rsum) == None:
                sum_map[rsum] = 1
            else:
                sum_map[rsum] += 1
            
        return count
    
s = Solution()
print(s.subarraySum([1,1,1], 2))