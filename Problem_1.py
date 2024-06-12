# Time Complexity : O(n) 
# Space Complexity : O(n) 
# Did this code successfully run on Leetcode : yes	
# Any problem you faced while coding this : Followed approach from the class 
#contigious array
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hashmap = {}
        hashmap[0] = -1 
        currSum = 0
        maxLength = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                currSum += -1 
            else:
                currSum += 1
            if currSum in hashmap :
                maxLength = max(maxLength , i - hashmap[currSum])
            else:
                hashmap[currSum] = i
        return maxLength 