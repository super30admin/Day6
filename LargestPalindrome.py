#Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
#Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

#Time Complexity : O(n)
#Space Complexity : O(1)

class Solution:
    def longestPalindrome(self, s: str) -> int:
        charCount ={}
        longestPalindrome = 0
        oddChar = 0
        for char in s:
            if char in charCount:
                charCount[char] += 1
            else:
                charCount[char] = 1
        for key, value in charCount.items():
            if charCount[key] %2 == 0:
                longestPalindrome += charCount[key]
                
            else:
                longestPalindrome += charCount[key]-1
                oddChar += 1
        if oddChar > 0:
            longestPalindrome += 1
        return longestPalindrome
    
