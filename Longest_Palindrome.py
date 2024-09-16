class Solution:
    def longestPalindrome(self, s: str) -> int:
        l=set()
        count=0
        
        for i in s:
            if i not in l:
                l.add(i)
            else:
                count+=2
                l.remove(i)
                
        if len(l)!=0:
            return count+1
        
        return count
            
            
            
        
                
            
            
            
        