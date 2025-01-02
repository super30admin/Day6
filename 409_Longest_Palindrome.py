#time: O(n)
#Space: O(1)

class Solution:
    def longestPalindrome(self, s: str) -> int:
        if(len(s) == 0):
            return
        if(len(s) == 1):
            return 1
        hs=set()
        cnt = 0
        for i in s:
            if str(i) in hs:
                cnt +=2
                hs.remove(str(i))
            else:
                hs.add(str(i))
        if len(hs) !=0:
            cnt +=1
        return cnt


        
