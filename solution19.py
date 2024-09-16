#Time Complexity:O(n)
#Space Complexity:O(n)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        h={}
        count=0
        for i in range(len(s)):
            if s[i] in h.keys():
                h[s[i]]=h[s[i]]+1
                if h[s[i]]==2:
                    count=count+2
                    h[s[i]]=0
            else:
                h[s[i]]=1
        if 1 in h.values():
            return count+1
        else:
            return count