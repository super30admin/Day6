# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : 
# Your code here along with comments explaining your approach

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        dic = {0: -1}
        # dic[0] = -1
        count = 0
        maxLen = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                count += 1
            else:
                count -= 1
                
            if count in dic:
                maxLen = max(maxLen, i - dic[count])
            else:
                dic[count] = i
            
        return maxLen
