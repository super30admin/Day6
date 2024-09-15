# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def longestPalindrome(self, s: str) -> int:
        _set = set()
        max_size = 0
        for _char in s:
            if _char not in _set:
                _set.add(_char)
            else:
                _set.remove(_char)
                max_size += 2
        if len(_set) != 0:
            max_size += 1
        del _set
        return max_size