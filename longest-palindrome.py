# Time Complexity O(n)

class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        a = set()
        count = 0
        for i in s:
            if i not in a:
                a.add(i)
            else:
                a.discard(i)
                count+=2

        if a:
            count+=1
        return count
