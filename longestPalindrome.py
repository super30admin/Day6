"""
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Time = O(N); N = length of string
Space = O(N); create a hashmap

Successfully executed in leetcode

Approach(Hashmap) ---

1. Here, longestPlindrome = 2*numPairs + 1 if 2*numPairs < len(s) (the extra 1 is because a single character can go in the middle)
2. Create a HashMap with character count, update palindromeLength to return max value
"""


class LongestPalindrome:
    def longestPalindrome(self, s: str) -> int:
        pairsCount = 0
        charMap = {}
        
        for char in s:
            if char not in charMap:
                charMap[char] = 1
            else:
                charMap[char] += 1
                   
        n = len(s)
        for c in charMap:
            pairsCount += charMap[c] // 2
        palindromeLength = pairsCount * 2
        if palindromeLength < n:
            palindromeLength += 1
        return palindromeLength