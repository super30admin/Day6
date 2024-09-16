
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach





class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashm = [0]*52
        count = 0
        for i in range(len(s)):
            if hashm[ord(s[i])-96] == 1:
                hashm[ord(s[i])-96] = 0
                count = count+2
            else:
                hashm[ord(s[i])-96] = 1
        if count!=len(s):
            return count+1
        else:
            return count
