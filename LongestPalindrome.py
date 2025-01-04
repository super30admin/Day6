class Solution:
    def longestPalindrome(self, s: str) -> int:
        # TC: O(n)
        # SC: O(1)
        # used hashset to keep track of charecters encountered and incremented the palindrome length in accordingly
        if s is None or len(s) == 0:
            return 0
        if len(s) == 1:
            return 1
        charset = set()
        palinlen = 0
        for ch in s:
            if ch in charset:
                charset.remove(ch)
                palinlen += 2
            else:
                charset.add(ch)
        if charset:
            palinlen += 1
        return palinlen
        