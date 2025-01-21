"""

Given a string s which consists of lowercase or uppercase letters, return the length of the longest 
palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome.

Example 1:
Input: s = "abccccdd"
Output: 7

Example 2:
Input: s = "a"
Output: 1

Time Complexity : O(N)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

"""

# The approach uses a set to track character occurrences while iterating through the string.  
# When a character is found twice, it contributes two to the palindrome length and is removed from the set.  
# If any characters remain in the set after iteration, one can be placed in the middle, increasing the length by one.  

class Solution:
    def longestPalindrome(self, s: str) -> int:

        char_set = set()
        res = 0

        for i in s:
            if i in char_set:
                char_set.remove(i)
                res += 2
            else:
                char_set.add(i)

        if char_set:
            res += 1

        return res
