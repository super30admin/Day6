# Time Compleity: O(n)
# Space compleity: O(1)
# Ran on leetcode: Yes


class Solution:
    def longestPalindrome(self, s: str) -> int:

        if len(s) == 1: return 1

        freq = set()
        count = 0

        for i in range(len(s)):
            if s[i] in freq:
                count = count + 2
                freq.remove(s[i])
            else:
                freq.add(s[i])

        if len(freq) != 0:
            count = count + 1
        return count
