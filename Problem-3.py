
# Longest Palindrome
'''
Leetcode all test cases passed: Yes
Solution:
    longestPalindrome(self,s):
        n is no of character in s
        Space Complexity: O(26) = O(1)
        Time Complexity: O(n)
'''

class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashSet = set()
        count = 0
        for c in s:
            if c in hashSet:
                hashSet.remove(c)
                count += 2
            else:
                hashSet.add(c)
        if len(hashSet) > 0:
            count += 1
        return count
