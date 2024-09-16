"""
Problem: Longest Palindrome
Leetcode: https://leetcode.com/problems/longest-palindrome/
Time Complexity: O(N), where N is the length of s. We need to count each letter.
Space Complexity: O(N), the space for our count and hashset
"""


class Solution:
    def longestPalindrome(self, s: str):
        # Base case
        if s is None or len(s) == 0:
            return 0

        count = 0
        # Define a hashset
        hashset = set()

        for i in range(len(s)):
            char = s[i]
            if char in hashset:
                hashset.remove(char)
                count += 2
            else:
                hashset.add(char)

        if hashset:
            count += 1
        return count


# Driver code
obj = Solution()
print(obj.longestPalindrome("abccccdd"))