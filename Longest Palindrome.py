class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashset = set()
        size = 0

        for x in range(len(s)):
            ch = s[x]

            if ch in hashset:
                size += 2
                hashset.discard(ch)
            else:
                hashset.add(ch)

        if len(hashset) == 0:
            return size
        return size + 1

    """
    Time Complexity: O(n)
    Space Complexity: O(n)
    """