"""
Problem3 (https://leetcode.com/problems/longest-palindrome)
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
This is case sensitive, for example "Aa" is not considered a palindrome here.
Note: Assume the length of given string will not exceed 1,010.
Example:
Input:
"abccccdd"
Output:
7
Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
Time complexity: O(N)
Space complexity: O(1)
Challenges: No
Executed in Leetcode: Yes
"""
class Solution:
    def longestPalindrome(self, s: str) -> int:

        result = 0
        for k,val in collections.Counter(s).items():  #can use itervalues() to directly get values
        
            result += int(val / 2) * 2
    
        # Look for unique character
        if result < len(s): 
            return result+1
        else:
            return result
