# S30 Big N Problem #18 {Easy}

# Given a string consisting of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
#This is case sensitive, for example "Aa" is not considered a palindrome here.

# Time Complexity : O(n) n= length of string
# Space Complexity : O(n) n= length of string
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 

# Maintain a set. Alternatively add or remove chars when they appear in the string. 
# When the char is removed, add the count by 2. 
# When a element is present in set, increment the final count by 1


class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        dic=set()
        cnt=0
        for a in s:
            
            if a in dic:
                dic.discard(a)
                cnt+=2
                
            else:
                dic.add(a)
        
        if len(dic)!=0:
            cnt+=1
        
        return cnt
        
        
        