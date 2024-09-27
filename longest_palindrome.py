# O(N) TIME AND O(N) SPACE WHERE N IS LEN(S)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        palindrome_len = 0
        counts = set()
        for char in s:
            if char not in counts:
                counts.add(char)
            else:
                palindrome_len += 2
                counts.remove(char)
        return palindrome_len if len(counts) == 0 else palindrome_len + 1
        