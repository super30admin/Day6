# Time Complexity: O(n)
# Space Complexity: O(n)
# Did this code successfully run on Leetcode: all test cases passed
# Any problem you faced while coding this: No

# Approach: We traverse through each element of the string. Whenever a character is encountered, check if it is present in the 
# hashset. If yes, pop the character and add 2 to the length. If not, then add the character to the set.

# Longest Palindrome

class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        length = 0
        myset = set()
        
        for char in s:
            if char in myset:
                length = length+2
                myset.remove(char)
            else:
                myset.add(char)
            
        if myset:
            return length+1  
        
        return length