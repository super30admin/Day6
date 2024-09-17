#Time Complexity - O(n)
#Space Complexity - O(n) 

class Solution:
    def longestPalindrome(self, s: str) -> int:
        set_s = set()
        cnt = 0
        
        for x in s:
            if x in set_s:
                set_s.remove(x)
                cnt += 2
            else:
                set_s.add(x)
        
        if len(set_s) != 0:
            cnt += 1
        
        return cnt