"""
Time Complexity: O(n)
Spaace Complexity: O(n)
"""

class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashset = set()
        count = 0

        for i in s:
            if hashset.__contains__(i):
                count += 2
                hashset.remove(i)
            else:
                hashset.add(i)

        if len(hashset) != 0:
            count += 1

        return count