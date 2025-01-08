#time complexity- 0(n) and space complexity- 0(1)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        if s == None or len(s) ==0:
            return 0
        
        count=0
        myset= set()
        for i in range (len(s)):
            if s[i] not in myset:
                myset.add(s[i])
            else:
                count = count+2
                myset.remove(s[i])
        if myset:
            count = count+1

                
        return count