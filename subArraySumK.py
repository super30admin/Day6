# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : 1
# Any problem you faced while coding this : 0


# Your code here along with comments explaining your approach

class Solution:
    def subarraySum(self, nums, k: int) -> int:
        if not nums:
            return 0
        
        sumMap = {}
        sumMap[0] = 1
        
        rSum = 0
        count = 0
        
        for i in range(len(nums)):
            # calculate running sum
            rSum += nums[i]
            
            #check whether compliment exists
            if (rSum - k) in sumMap.keys():
                count += sumMap[rSum-k]
                
            # update the map with new sum or new count
            if rSum in sumMap.keys():
                sumMap[rSum] += 1
            else:
                sumMap[rSum] = 1
            
        return count
                

# counting frequency of the running sum by comparing difference of each value in a target