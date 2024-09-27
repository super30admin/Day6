class Solution:
    def longestPalindrome(self, s: str) -> int:

        hashset=set()
        count=0
        if s is None or len(s)==0:return 0
        for i in range(len(s)):
            if s[i] in hashset:
                count+=2
                hashset.remove(s[i])
            else:
                hashset.add(s[i])

        if len(hashset)!=0:
            count+=1
        return count        
