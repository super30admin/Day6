class Solution(object):
    def longestPalindrome(self, s):
        seta=set()
        length=0
        for i in s:
            if i not in seta:
                seta.add(i)
            else:
                length+=2
                seta.remove(i)
        if len(seta)!=0:
            length+=1
        return length
        