## Problem3 (https://leetcode.com/problems/longest-palindrome)

# // Time Complexity : O(n)s
# // Space Complexity : O(n) - (where n=26) but asymptotically it should O(1) as maximum size could go until 26 unique alphabets only.
# // Did this code successfully run on Leetcode :Yes. Executed with 240ms

class Solution:
    def longestPalindrome(self, s: str) -> int:
        if not s:
            return 0
        if (len(s) == 1):
            return 1
        hashSet = set()
        count = 0
        for c in s:
            if c in hashSet:
                count = count+2
                hashSet.remove(c)
            else:
                hashSet.add(c)
        if(len(hashSet)>0):
            return count+1
        else:
            return count
