"""Approach - Keep adding each char to of string to the hashmap, when ever we find duplicate, increase palindrome length by 2
and remove the char from hashmap. Chck thr hashmap in the end, if it has elemnt present, then we can select only one char among 
them for the palindrome, so add palin len by 1. if string has only unique chars, then longest len of palin can be 1 only"""

#Accepted on leetcode
#Time complexity - O(n) as we traverse entire string
#Space omplexity - O(1) since we have 26 alphabets

class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        n = 0
        _hashset = set()
        for i in range(len(s)):
            c = s[i]
            if c in _hashset:
                n += 2
                _hashset.remove(c)
            else:
                _hashset.add(c)
        if len(_hashset) > 0:
            return n+1
        return n