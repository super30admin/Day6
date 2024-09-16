"""
TC:O(n)
SC:O(1)

"""

class Solution:
    def longestPalindrome(self, s: str) -> int:
        map1={}
        counter = 0
        for i in s:
            if i not in map1.keys():
                map1[i]=1
            else:
                map1[i]+=1
        for j in list(map1):
            if map1[j]%2==1:
                counter += map1[j]-1
            else:
                counter +=map1[j]
                del map1[j]
        if not map1:
            return counter
        else:
            return counter+1