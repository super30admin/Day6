class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        palindrome = set()
        maximum = 0
        
        for i in s:
            if i not in palindrome:
                palindrome.add(i)
            else:
                maximum += 2
                palindrome.remove(i)
        if(palindrome):
            return maximum + 1
        else:
            return maximum
