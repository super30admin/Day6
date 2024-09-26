class Solution:
    def longestPalindrome(self, s: str) -> int:
        d = {}
        length = 0
        for c in s:
            if c not in d:
                d[c] = 1
            else:
                del d[c] 
        
        if not d:
            return len(s)
        return len(s) - len(d) + 1
                
            