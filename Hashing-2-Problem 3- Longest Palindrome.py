"""
 FAANMG Problem #19 {Easy}

409. Longest Palindrome


Time Complexity : O(N)
 

Space Complexity : O(1)


Did this code successfully run on Leetcode : Yes


Here hashSet is usd to store the aplphabets.
If there is a repeating character in the set its removed from the set and count is increated by 2

At the end, if there are any elements present in the set, then count+1 is returnend else the couunt

  

    
@name: Rahul Govindkumar_RN27JUL2022
"""


class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        hashset = set()
        count=0
        for i in range(len(s)):
            
            if(s[i] in hashset):
                hashset.remove(s[i])
                count+=2
            else:
                hashset.add(s[i])
         
        if(len(hashset) != 0):
            return count+1
        else:
            return count
        