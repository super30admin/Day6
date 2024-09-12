# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :  A little bit. 
# Took awhile to figure out a O(N) solution 

# Your code here along with comments explaining your approach

# O(N^2) SOLUTION.. TLE 
# class Solution:
#     def findMaxLength(self, nums: List[int]) -> int:
#         """
#         Can do this in one pass?
#         """
#         maxLength = 0
        
#         for i in range(len(nums)):
#             zero = 0
#             one = 0
            
#             for j in range(i, len(nums)):
#                 if nums[j] == 0:
#                     zero += 1
#                 else:
#                     one += 1
                
#                 if zero == one:
#                     maxLength = max(maxLength, j-i+1)
                    
#         return maxLength


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        """
        Can do this in one pass?
        - use one var for comparing.. prob make 0 -1 and 1 just +1
        - whenever we at the equilibrium we check maxLength
            - find distance from first occurrence
        """ 
        
        onGoinSum = 0
        maxLength = 0
        occurrence = defaultdict()
        
        for i, j in enumerate(nums):
            if j == 0:
                onGoinSum -= 1
                if onGoinSum == 0:
                    maxLength = max(maxLength, i+1)
                if onGoinSum not in occurrence:
                    occurrence[onGoinSum] = i
                else:
                    maxLength = max(maxLength, i-occurrence[onGoinSum])
            else:
                onGoinSum += 1
                if onGoinSum == 0:
                    maxLength = max(maxLength, i+1)
                if onGoinSum not in occurrence:
                    occurrence[onGoinSum] = i
                else:
                    maxLength = max(maxLength, i-occurrence[onGoinSum])
        return maxLength