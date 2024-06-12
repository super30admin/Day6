# TC: O(n)
# SC: O(n)
# LeetCode: Y(https://leetcode.com/problems/longest-palindrome/)
# Approach: In a palindrome of even length, the number of occurences of each character is an even number.
#           In a palindrome of odd length, the number of occurences of each character except the middle one is an even number.
#           if the occurences of a character in a string is even then all of the occurences can be used to construct a palindrome
#           if the occurences of a character in a string is odd then all of the occurences except one can be used to construct a palindrome
#           Calculate a mapping of characters to frequencies and add the frequency to the result(if odd then add one less than ots frequency)
#           At the end, check if it possible to use a character with odd frequency then increment 1 in the result

class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        # dictionary to store charcter counts
        character_counts = {}
        
        # result
        longest_palindrome_length = 0
        
        # populate dictionary
        for character in s:
            character_counts[character] = character_counts.get(character, 0) + 1
        
        # iterate over the dictionary and update result
        for character, frequency in character_counts.items():
            longest_palindrome_length += (frequency // 2) * 2
                
        # if it possible to use a character with odd frequency then increment 1 in the result
        return longest_palindrome_length + 1 if longest_palindrome_length < len(s) else longest_palindrome_length
            
        
