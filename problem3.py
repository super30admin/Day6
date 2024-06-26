#time-O(n)
#space- O(n)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashmap={}
        res=0
        odd = False
        
        
        for c in s:
            if c in hashmap:
                hashmap[c]+=1
            else:
                hashmap[c]=1
        
        for key in hashmap:
            if hashmap[key]%2==0:
                res+=hashmap[key]
            
            else:
                odd=True
                res+=hashmap[key]-1
             
        if odd:
            return res+1
        else:
            return res

        
        