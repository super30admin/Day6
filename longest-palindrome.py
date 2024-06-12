# Time Complexity : O(n), where n is the length of the string
# Space Complexity : O(1), since the number of characters is limited to 26
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def longestPalindrome(self, s: str) -> int:
        occurred = set()

        for char in s:
            if char in occurred:
                occurred.remove(char)
            else:
                occurred.add(char)

        return len(s) - len(occurred) + bool(occurred)
