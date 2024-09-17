"""
409. Longest Palindrome
Time Complexity - O(n)
Space Complexity - O(n)

1. Traverse through list and check whether character in set or not
    i) If yes, remove element from set and increment counter by 2
    ii) Else, add element in set
if len(set) > 0 add 1 in counter and return counter
"""
class Solution:
    def longestPalindrome(self, s: str) -> int:
        size = set()
        count = 0
        for i in range(len(s)):
            if s[i] in size:
                size.remove(s[i])
                count += 2
            else:
                size.add(s[i])
        if len(size) > 0:
            return count+1
        return count