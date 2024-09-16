# -*- coding: utf-8 -*-
"""
Created on Fri Mar 26 19:47:59 2021

@author: jgdch
"""

#Time complexity: O(N), where N is the length of the string s
#Space Complexity: O(1), since we only have fixed number of lower and uppercase letters
class Solution:
    def longestPalindrome(self, s: str) -> int:
        set_char=set()
        count=0
        for i in range(len(s)):
            if s[i] in set_char:
                set_char.remove(s[i])
                count+=2
            else:
                set_char.add(s[i])
        if(len(set_char)!=0):
            count+=1
        return count