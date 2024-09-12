 # Time Complexity : O(n)
 # Space Complexity : O(n)
 # Did this code successfully run on Leetcode : Yes
 # Any problem you faced while coding this : None
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hashmap = {}
        hashmap[0] = -1
        rSum = 0
        max_length = 0
        for i in range(len(nums)):
            if nums[i] == 1:
                rSum += 1

            elif nums[i] == 0:
                rSum -= 1
            if rSum in hashmap:
                max_length = max(max_length,i - hashmap[rSum])
            else:
                hashmap[rSum] = i
        return max_length
