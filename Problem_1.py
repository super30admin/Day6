# 525. Contiguous Array

# Approach: We keep a running count, whenever we hit a '0' we add 1 
# and whenever we hit a '1' we subtract 1 from the running count.



class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        count = 0  # --> variable to store the running count
        res = 0  # --> variable to store and return the result.
        
        mapping = {} # --> key:val map in this case we store "sum:index"
        
        for i in range(len(nums)):
            # Calculating the running count!
            
            if nums[i]==1:
                count-=1
            else:
                count+=1
            
            # When we encounter the running count with '0', that means all the elements until then is valid including the element itself. so we use index+1.
            
            if count==0: 
                res = max(res,i+1)
            
            # Storing the prev counts to validate the contiguous logic.
            if count not in mapping:
                mapping[count] = i
            else:
                res = max(res, i-mapping[count])
        
        return res


# Time Complexity: O(N)
# Space Complexity: O(N)
# Accepted on Leetcode: Yes.
# Any Difficulty faced. No.