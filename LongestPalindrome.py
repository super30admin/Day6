# Time Complexity : O(N) where N is number of characters in string s
# Space Complexity : O(1) because maximum size of HashMap is 52 (only small and capital alphabets).
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def longestPalindrome(self, s: str) -> int:
        '''Longest Palindrome 2 * s + I(MiddleCharacter)'''
        '''s is the total occurences of characters that exist in pairs.'''
        d = {}
        for char in s:
            d[char] = d.get(char, 0) + 1
        
        foundOdd = False  #For finding middle character
        maxLen = 0
        for val in d.values():
            maxLen += ( val // 2 ) * 2 #To get only even components
            if not foundOdd and val % 2 == 1:
                foundOdd = True
        
        if foundOdd:
            maxLen += 1
        
        return maxLen

