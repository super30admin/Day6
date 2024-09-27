# Time Complexity : O(n)
# Space Complexity : O(n)
class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        count = 0
        for value in collections.Counter(s).itervalues():
            count += value / 2 * 2
            if count % 2 == 0 and value % 2 == 1:
                count += 1
        return count