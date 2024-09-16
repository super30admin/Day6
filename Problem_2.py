# 560. Subarray Sum Equals K

# Approach: We keep track of the running count, at every element's running count we check if the compliment(count-target) is present in the map or not. If it's present, we update our result. We check if the count is present in the map or not, if it's present we update else we initialize.


# Code:

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        # Initializing variables and data structures
        count = 0
        res = 0
        mapping ={}
        comp = 0
        
        # Initialization for empty subarray
        mapping[0]=1
        
        # Iterate over the given array. All elements -> O(N)
        for i in range(len(nums)):
            count+=nums[i]
            comp = count-k
            
            # checks if the comp is present in the map
            if comp in mapping:
                res+=mapping[comp]
            
            # checks if the count is present in the map
            if count in mapping:
                mapping[count]+=1
            else:
                mapping[count] = 1
        
        return res
                


# Time Complexity: O(N)
# Space Complexity: O(N)
# Accepted on Leetcode: Yes.
# Any Difficulty faced. No.