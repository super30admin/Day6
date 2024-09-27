""""// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
"""


class Solution:
    def longestPalindrome(self, s: str) -> int:
        d={}
        x=0
        for i in range (len(s)):
            if s[i] not in d:
                d[s[i]]=1
            else:
                d[s[i]]+=1
        for a in d:
            if d[a]%2==0:
                x+=d[a]
            else:
                x+=d[a]-1
        if d!={}:
            if(x<len(s)):
                x += 1

            return x

