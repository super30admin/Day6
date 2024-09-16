# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
class Solution:
    def subarraySum(self, nums: List[int], k: int) :
        hashmap = {}
        hashmap[0] = 1
        rSum = 0
        count = 0
        #i = 0
        for i in range(len(nums)):
           
            rSum += nums[i]
            # print("rSum :", rSum)
            # print("rSum complement :", rSum - k)
            if (rSum - k in hashmap):
                count += hashmap[rSum - k]
            if (rSum not in hashmap):
                hashmap[rSum] = 1
        
        
        
        
        
        