class Solution:
    #SC O(n)
    # TC O(n)
    def longestPalindrome(self, s: str) -> int:
        if s == None or len(s) == 0:
            return 0
        l =set()
        count = 0
        for c in s:
            if c not in l:
                l.add(c)
            else:
                count += 2
                l.remove(c)
        if len(l) > 0:
            count += 1
        return count
            
        
        
