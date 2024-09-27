class Solution:
    def longestPalindrome(self, s: str) -> int:
        d = set()
        result = 0
        for c in s:
            if c in d:
                d.remove(c)
                result += 2
            else:
                d.add(c)
                
        if len(d):
            result += 1
        
        return result
