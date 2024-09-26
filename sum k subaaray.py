# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this :No


# // Your code here along with comments explaining your approach
# Use RUNNING SUM
# In map store the count of running sum as key and its occurances as value
# Look if rsum - k is in map
# if there we have found the required subarray add value of mp[rsum-k] to count
# If rsum is in map then add 1
# else add rsum to map with value 1

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        mp = {}
        mp[0] = 1
        rsum = 0
        count = 0
        
        for i in range(len(nums)):
            rsum += nums[i]
            
            if rsum-k in mp:
                count += mp[rsum-k]
            
            if rsum in mp:
                mp[rsum] += 1
            else:
                mp[rsum] = 1
        return count
        