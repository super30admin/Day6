# Created by Aashish Adhikari at 7:49 PM 1/2/2021

'''
Time Complexity:
O(n)

Space Complexity:
O(1) since the max number of entries in the hashset is predefined.


'''


class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """

        hs = set()
        leng = 0

        for idx in range(len(s)):

            if s[idx] in hs:
                leng += 2
                hs.remove(s[idx])
            else:
                hs.add(s[idx])

        if len(hs) != 0:
            return leng+1

        return leng