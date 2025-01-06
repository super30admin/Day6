"""
Problem 3: Longest Palindrome (https://leetcode.com/problems/longest-palindrome/)
Time Complexity: O(n)
Space Complexity: O(1)
Approach: The approach uses a hash set to track characters with odd occurrences.
For each character in the string, if it is already in the set, it is removed and the result is incremented by 2.
Finally, if there are any characters left in the set,
one is added to the result to account for the center of the palindrome.
"""


class Solution:
    def longestPalindrome(self, s: str) -> int:
        if not s or len(s) == 0:
            return 0

        hashset = set()
        result = 0

        for ch in s:
            if ch in hashset:
                hashset.remove(ch)
                result += 2

            else:
                hashset.add(ch)

        if hashset:
            result += 1

        return result
