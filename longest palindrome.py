class Solution:
    def longestPalindrome(self, s: str) -> int:
        charSet = set()
        count = 0
        for i in range(0, len(s)):
            if s[i] in charSet:
                charSet.remove(s[i])
                count += 2
            else: charSet.add(s[i])
        return count if not charSet else count + 1
    
