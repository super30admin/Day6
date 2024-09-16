# Time Complexity :O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach
class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 0
        pos = {0:-1}
        maxLength = 0
        for i in range(len(nums)):
            # if you find a one add a one to count else subtract one
            if nums[i] ==1:
                count+=1
            else:
                count -=1
            # if we reached this level before check if this is the max we reached
            if count in pos:
                maxLength = max(maxLength, i-pos[count])
            else:
            # save the level if first time to see
                pos[count] = i
        #return max Length
        return maxLength