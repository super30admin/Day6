#
# Time Complexity  = O(n)
# Space Complexity  = O(1)
# Worked on leetcode
#
class Solution:
    def longestPalindrome(self, s: str) -> int:
        from collections import Counter
        freq = Counter(s)
        res = 0
        for key, val in freq.items():
            res += val//2*2
        if res < len(s): # Odd length pallindrome scenario
            return res+1
        return res
