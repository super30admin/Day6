#Leetcode Problem 290
#this problem's logic is same as isomorphic string problem.
class Solution:
    def wordPattern(self, pattern, s):
        pdict={}
        sdict={}
        sSplit=s.split(" ")
        if len(pattern)!=len(sSplit):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in pdict:
                pdict[pattern[i]]=sSplit[i]
            else:
                if pdict[pattern[i]]!=sSplit[i]:
                    return False
            
            if sSplit[i] not in sdict:
                sdict[sSplit[i]]=pattern[i]
            else:
                if sdict[sSplit[i]]!=pattern[i]:
                    return False
        return True

#TC: O(n)
#SC: O(1) as there will be only 26 characters in case of smaller case alphabets.