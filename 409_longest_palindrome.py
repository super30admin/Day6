class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        if len(s) ==0:
            return 0 
        if len(s)==1:
            return 1 
        
        arr = list(s)
        d = {}; count = 0 
        
        for char in arr:
            if char in d: 
                d[char]+=1 
            else:
                d[char] = 1
                
            if d[char]==2:
                count +=2
                d[char]-=2
            
        for k in d.keys():
            if d[k] > 0:
                count +=1 
                break 
                
        return count
