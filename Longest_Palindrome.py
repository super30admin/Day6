# Time Complexity : 0(n)
# Space Complexity : 0(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

class Solution:
    def longestPalindrome(self, s: str) -> int:
        if len(s) == 1:
            return 1
        count = 0
        for i in range(len(s)-1):
            for j in range(i+1, len(s)):
                if s[i] == s[j]:
                    count += 1
      
        return count
            

