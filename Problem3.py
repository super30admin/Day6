# -*- coding: utf-8 -*-
"""
Created on Thu Aug 26 20:17:41 2021

@author: User
"""


class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
    
    if(len(s)==0):
        return 0
    char_hash={}
    count=0
    for i in range(len(s)):
        if(s[i] in char_hash):
            count+=2
            char_hash.pop(s[i])
        else:
            char_hash[s[i]]=1
    if bool(char_hash):
        count=count+1