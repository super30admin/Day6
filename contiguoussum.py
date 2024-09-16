# Time Complexity : O(N^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Ran for 69/80 test cases. Time limit exceeded for the rest.
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
# Used brute force to iterate over the array and find if each subarray sum is equal to k

class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        n = len(nums)
        count = 0
        if n == 1:
            if k == nums[0]:
                return 1
            else:
                return 0
        for i in range(0,n):
            sum = 0
            for j in range(i,n):
                if i == j:
                    sum += nums[i]
                    if nums[i] == k:
                        count +=1
                        
                else:
                    sum += nums[j]
                    if sum == k:
                        count +=1
        return count
                    
        