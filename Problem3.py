class Solution:
    def longestPalindrome(self, s: str) -> int:
        seen = set()
        res = 0

        for c in s:
            if c in seen:
                seen.remove(c)
                res += 2
            else:
                seen.add(c)
        if seen:
            res += 1
        return res

    # T: O(n), S: O(1)