class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        cnt = 0
        hs = set()
        
        for i in s:
            if i in hs:
                cnt += 2
                hs.remove(i)
            else:
                hs.add(i)
        
        if hs:
            cnt += 1
        
        return cnt