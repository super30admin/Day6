# Time complexity: O(n)
# Space complexity: O(n)

class Solution:
    def longestPalindrome(self, s: str) -> int:
        h_set = set()
        for ch in s:
            if ch not in h_set:
                h_set.add(ch)
            else:
                h_set.remove(ch)
        if len(h_set) > 0:
            return len(s) - len(h_set) + 1
        else:
            return len(s)