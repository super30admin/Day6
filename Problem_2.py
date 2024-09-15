# LC_205 , Isomorphic Strings
# Time Complexity : O(n)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        d1 = {} #Making an empty dicitionary.
        d2 = {}
        for i,value in enumerate(s):
            d1[value] = d1.get(value,[]) + [i]
        for j,value in enumerate(t):
            d2[value] = d2.get(value,[]) + [j]
        return(sorted(d1.values()) == sorted(d2.values()) )