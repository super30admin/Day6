#The findMaxLength method aims to find the maximum length of a contiguous subarray where the count of 1s equals the count of 0s. It uses a dictionary diff to track the first occurrence of the difference between counts. As it iterates through the list nums, it updates counts and checks if the current difference has been seen before to calculate the maximum subarray length. This ensures an efficient O(n) time complexity, where n is the length of nums, and O(n) space complexity due to the storage in diff.

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        ones = 0
        zeros = 0
        res = 0
        diff = {} 

        for i, n in enumerate(nums):
            if n == 1:
                ones += 1
            else:
                zeros += 1
            
            if ones - zeros not in diff:
                diff[ones - zeros] = i
            
            if ones == zeros:
                res = ones + zeros
            else:
                idx = diff[ones - zeros]
                res = max(res, i - idx)
        
        return res