#LC 409 - Longest Palindrome
#Time Complexity - O(n)
#Space Complexity - O(n)
class Solution(object):
    def longestPalindrome(self, st):
        """
        :type s: str
        :rtype: int
        """
        if len(st) == 1:
            return 1
        s = set()
        count = 0
        for i in st:
            if i in s:
                s.remove(i)
                count = count + 2
            else:
                s.add(i)
        if len(s) > 0:
            return count + 1
        return count