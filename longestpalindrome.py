#TC O(n) and SC O(1)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        if s == None or len(s) == 0:
            return 0
        myset = set()
        count = 0
        for i in range(len(s)):
            c = s[i]
            if c in myset:
                count += 2
                myset.remove(c)
            else:
                myset.add(c)
        if len(myset) > 0:
            count += 1
        return count