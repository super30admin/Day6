 # Time Complexity : O(n)
 # Space Complexity : O(1)
 # Did this code successfully run on Leetcode : Yes
 # Any problem you faced while coding this : None
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashmap = {}
        oddlength = 0
        if len(s) == 1:
            return 1
        for i  in range(len(s)):
            if s[i] not in hashmap:
                hashmap[s[i]] = 0
            hashmap[s[i]] += 1

        for key in hashmap.keys():
            if hashmap[key] % 2 != 0:
                oddlength += 1
        if oddlength > 0:
            return len(s) - oddlength + 1
        else:
            return len(s)
