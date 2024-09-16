# // Time Complexity : O(N)
# // Space Complexity : O(N)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach

# Input: nums = [0,1]
# Output: 2
# Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.

# Input: nums = [0,1,0]
# Output: 2
# Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        Hashmap = dict()
        maximum = 0
        runningSum = 0
        Hashmap[0] = -1
        for i in range(len(nums)):
            if nums[i] == 0:
                runningSum -= 1 
            else:
                runningSum += 1
                
            if runningSum in Hashmap.keys():
                maximum = max(maximum, i - Hashmap[runningSum])
            else:
                Hashmap[runningSum] = i
                
        return maximum
                