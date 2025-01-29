# 409. Longest Palindrome: https://leetcode.com/problems/longest-palindrome/description/


# Time Complexity : O(n) 
# Space Complexity :O(1) # constant space because 26 or 52 letters atmost
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach

# take a frequency map(dictionary) of the letters in the string. 
# for each letter if the count is even increment the len by that count. if it is odd then increment by
# its count - 1 and in odd_cnt increment it by 1. by the end if the odd_cnt is not zero then increse len 


# solution 1: using dictionary

class Solution:
    def longestPalindrome(self, s: str) -> int:

        if not s:
            return 0

        cc = {} #frequency map
        for c in s:
            if c in cc:
                cc[c] += 1
            else:
                cc[c] = 1

        len = 0
        odd_cnt = 0
        for cnt in cc.values():
            if cnt % 2 == 0:
                len += cnt
            else:
                len += cnt - 1
                odd_cnt += 1

        if odd_cnt > 0:
            len += 1

        return len


# solution 2: using hashset

# its pretty much similar to the above one except we take hashset here and we increment result by 2 if
# the letter is found in the set and then remove it from the set too. at the end if the set is not empty
# then increse the result by 1 and return 

class Solution:
    def longestPalindrome(self, s: str) -> int:
        cntset = set()
        result = 0
        for i in range (len(s)):
            if s[i] in cntset:
                result += 2
                cntset.remove(s[i])
            else:
                cntset.add(s[i])
        
        if cntset:
            result += 1
        
        return result
