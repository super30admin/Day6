# S30 Big N Problem #18 {Easy}

# Given a string consisting of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
#This is case sensitive, for example "Aa" is not considered a palindrome here.

# Time Complexity : O(n) n= length of string
# Space Complexity : O(n) n= length of string
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 

# Maintain a dictionary of count of each letter in the string
# if the count is even, add it in the result  
# if the count is odd, add 1 less the count in the result
class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        dic={}
        
        for a in s:
            
            if dic.get(a,-1)==-1:
                dic[a]=1
            else:
                dic[a]+=1
        
        
        isOdd=False
        cnt=0
        
        for val in dic.values():
            
            if val%2==0:
                cnt+=val
            else:
                cnt+=val-1
                isOdd=True
        
        if isOdd:
            return cnt+1
        else:
            return cnt
                
        