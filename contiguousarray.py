# Time Complexity : O(N^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Ran for 32/555 test cases. Time limit exceeded for the rest.
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
# Used brute force to iterate over the array and find if each subarray is having equal number of zeros and ones

class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 0
        maxlen = 0
        for i in range(0,len(nums)-1):
            countzero = 0
            countone = 0
            for j in range(i, len(nums)):
                if i == j:
                    if nums[i] == 0:
                        countzero += 1
                    if nums[i] == 1:
                        countone += 1
                else:
                    if nums[j] == 0:
                        countzero += 1
                    if nums[j] == 1:
                        countone += 1
                if countzero == countone:
                    maxlen = max(maxlen,j-i+1)
                
        return maxlen
                
       
