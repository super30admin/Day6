class Solution:
    def longestPalindrome(self, s: str) -> int:
        if(len(s) == 0):
            
            return 0
        count= 0
        
        m = set()
        for i in range(len(s)):
            
            c = s[i]
            print(c)
            if(c in m):
                count = count + 2
                m.remove(c)
            else:
                m.add(c)
        
        if(len(m) != 0):
            count += 1
    
        return count