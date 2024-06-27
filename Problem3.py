#The longestPalindrome function calculates the maximum length of a palindrome that can be formed from characters in the string s. It counts character frequencies using a Counter, then iterates through these counts to determine how many characters can be used in pairs (even counts) and if there's at least one character with an odd count (which can be placed in the center of the palindrome). This ensures the function efficiently computes the desired palindrome length in linear time O(n), where n is the length of s, with constant space complexity O(1) for the variables used.

class Solution:
    def longestPalindrome(self, s: str) -> int:
        counts = Counter(s)
        length = 0
        odd_found = False
        
        for count in counts.values():
            length += count if count % 2 == 0 else count - 1
            if count % 2 == 1:
                odd_found = True
                
        return length + 1 if odd_found else length