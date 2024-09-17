# // Time Complexity : O(n) 
# // Space Complexity : O(n) 
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


class Solution:
    def longestPalindrome(self, s: str) -> int:
        mapping = dict()
        for i in range(len(s)):
            if s[i] in mapping.keys():
                mapping[s[i]] += 1
            else:
                mapping[s[i]] = 1
        values = list(mapping.values())
        res = 0
        odd = 0
        for i in range(len(values)):
            if values[i] %2 == 0:
                res += values[i]
            if values[i]%2 != 0:
                odd += 1
                res += (values[i]-1)
        if odd > 0:
            res += 1
        print(res, odd)
        return res