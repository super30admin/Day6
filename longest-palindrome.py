'''
T.C: O(n)
S.C: O(n)

Intuition: 

Hashset to track if element is there or not, if there, then they can be used to form palindrome, else add the element.

'''
class Solution:
    def longestPalindrome(self, s: str) -> int:
        slen = len(s)
        if not s:
            return 0
        
        tlen = 0
        hmap = set()
        
        for c in s:
            if c in hmap:
                tlen += 2
                hmap.remove(c)
            else:
                hmap.add(c)
        
        if hmap:
            tlen += 1
        
        return tlen
        