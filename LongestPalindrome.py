# -*- coding: utf-8 -*-
"""
Created on Sat Jan  4 19:18:38 2020

@author: WELCOME
"""
"""
Time Complexity = O(N) where N is length of string
Space Complexity = O(N)
"""
class Solution:
    def longestPalindrome(self, s: str) -> int:
        pair=set()
        count=0
        for i in s:
            if i not in pair:
                pair.add(i)
            else:
                pair.remove(i)
                count+=2
        if len(pair)!=0:
            count+=1
        return count
    
temp=Solution()
print(temp.longestPalindrome("abbbbbbcccccc"))