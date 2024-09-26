class Solution:
    def longestPalindrome(self, s: str) -> int:
        in = set()
        for letter in s:
            if letter not in in:
                in.add(letter)
            else:
                in.remove(letter)
        if len(in) != 0:
            return len(s) - len(in) + 1
        else:
            return len(s)