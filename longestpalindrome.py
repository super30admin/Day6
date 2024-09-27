#Time Complexity: O(1)
#Space Complexity: O(1)
def longestPalindrome(self, s: str) -> int:
        count=0
        hm={}
        for i in range(len(s)):
            if s[i] not in hm:
                hm[s[i]]=1
            else:
                count+=2  
                del(hm[s[i]])
        if len(hm)!=0:
            count+=1
        return count