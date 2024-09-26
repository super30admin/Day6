# Time Complexity: O(n), where n is length of s
# Space Complexity: O(1), since the alphabet size is fixed
# Did this code successfully run on Leetcode: Yes

# Solution:

class Solution:
    def longestPalindrome(self, s: str) -> int:
        if not s or len(s) == 0:
            return 0

        count = 0
        char_set = set()

        # Count every pair of same chars in s
        for ch in s:
            if ch in char_set:
                char_set.remove(ch)
                count += 2
            else:
                char_set.add(ch)

        # If there are any single chars left, add one to the count
        if len(char_set) > 0:
            count += 1

        return count