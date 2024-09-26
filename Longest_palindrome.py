# Time Complexity:- O(n)
# Space Complexity:- O(n)
# Approach:- We have to construct the maximum length of the palindrome possible. A palindrome has to have all even occurences of
# charachters and ONLY ONE odd occurence of a charachter. Considering these constraints, all the chcarachters which have even no.
# of occurences are part of the palindrome and all the odd charachters can still be considered in the longest palindrome because we
# have the freedom to include a charachter or not include it in the longest palindrome. However when we count an odd occurence a charachter that leaves behind one occurence of the charachter which we have to add to our final result.
import collections

class Solution:
    def longestPalindrome(self, s: str) -> int:
        d=collections.defaultdict(int)
        for i in s:
            # count the occurence of every charachter in the string
            d[i]+=1
        res=0
        maxodd=0
        found=0
        for i in d:
            if d[i]%2==0:
                # if a charachter has even occurence we can directly include it into our longest palindrome
                res+=d[i]
            else:
                # include even occurences of the charachter in the longest palindrome and remember to add 1 to final answer
                found=1
                res+=d[i]-1
        return res+found