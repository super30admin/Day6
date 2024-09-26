class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        ans, one = 0, 0
        n_c = set(s)

        for i in n_c:
            size = s.count(i)

            if size % 2 == 0:
                ans += size
            elif size > 2:
                ans += size -1
                one = 1
            elif size == 1 and one == 0:
                one = 1

        return ans + one
