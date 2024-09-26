# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
# Use RUNNING SUM
# consider -1 for 0 and +1 for 1 in running sum
# iterate and calculate running sum
# put the sum inside the hashmap (idex as the value) if not there
# if its there we have found the even 0's and 1's condition
# in that case use max function

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        mp = {}
        mp[0] = -1
        maximum = 0
        runningSum = 0
        
        for i in range(len(nums)):
            if(nums[i] == 0):
                runningSum -= 1
            else:
                runningSum += 1
                
            if runningSum not in mp:
                mp[runningSum]=i
            else:
                maximum = max(maximum,i-mp[runningSum])
        
        return maximum