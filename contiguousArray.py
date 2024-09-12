# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : y
# Any problem you faced while coding this : n


# Your code here along with comments explaining your approach
class Solution:
    def findMaxLength(self, nums) -> int:
        n = len(nums)
        zeros = [i for i in nums if i == 0]
        zero = len(zeros)
        one = n-zero
        
        if one == zero:
            return 2*one
        elif zero>one:
            return 2*one
        else:
            return 2*zero
        
s = Solution()
s.findMaxLength([1,0,1,1,0,1])

# iterating through and +1 for 1 and -1 for 0. if running sum counter becomes zero, means equal number of 1s and 0s