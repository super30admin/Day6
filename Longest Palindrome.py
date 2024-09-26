class Solution:
    # leetcode URL : https://leetcode.com/problems/longest-palindrome/
    # Problem : 409. Longest Palindrome
    # Time Complexity : O(n)
    # Space Complexity : O(1)
    def longestPalindrome(self, s: str) -> int:
        char_set = set()
        count = 0
        for c in s:
            if c in char_set:
                count = count+2
                char_set.remove(c)
            else:
                char_set.add(c)
        if len(char_set)!=0:
            count = count+1
        return count