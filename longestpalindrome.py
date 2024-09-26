# time complexity = O(n)
# Space complexity = O(1)
class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        A = set()
        counter = 0
        for i in range(len(s)):
            if s[i] not in A:
                A.add(s[i])
            else:
                A.remove(s[i])
                counter += 2
        if A:
            counter += 1
        return counter