# 409. Longest Palindrome

# Code:
class Solution:
    def longestPalindrome(self, s: str) -> int:
        # Apprach : For something to be a palindrome, Forward-Backward needs to be same. We will be using a hashset to see if the element is present or not. If its not present, we add it. If it's present, we know the count is 2! So, we will update the result(+2) and remove the element from the hashset.
        
        mapping = set()
        res = 0
        
        for i in s:
            if i in mapping:
                res+=2
                mapping.remove(i)
            else:
                mapping.add(i)
        
        if len(mapping)>0:
            return res+1
        else:
            return res
                
                
                

# Time Complexity: O(N)
# Space Complexity: O(N)
# Accepted on Leetcode: Yes.
# Any Difficulty faced. No.