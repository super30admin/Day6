"""
Approach: Linear with hashSet. TC O(n) and SC O(n)
"""

class Solution:
    def longestPalindrome(self, s: str) -> int:
        _s = set()
        result = 0
        for c in s:
            # if the char is in _set then remove it and consider it can be paired
            # hence result +2
            if c in _s:
                _s.remove(c)
                result += 2
            else:
                _s.add(c)
        if _s:
            # when _set is not empty we can pick any of the chars and pair it with
            # existing palindrome string at the middle hence do +1
            result += 1
        return result