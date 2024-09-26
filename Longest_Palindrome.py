class Solution:
    def longestPalindrome(self, s: str) -> int:
        l = []
        
        count = 0
        
        for i in s:
            if i not in l:
                l.append(i)
            else:
                count += 2
                l.remove(i)
            
        if len(l) != 0:
            count += 1
            
        return count
