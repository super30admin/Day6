class Solution:
    def longestPalindrome(self, s: str) -> int:
        if len(s)==0:
            return 0
        res=set()
        count=0
        for i in range(len(s)):
            if s[i] in res:
                res.remove(s[i])
                count = count+2
            else:
                res.add(s[i])      
        if len(res)>0:
            count = count +1
        return count
                
        