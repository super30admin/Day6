# Created by Aashish Adhikari at 7:41 PM 1/2/2021

'''
Time Complexity:
Only the first iteration counts --> O(n) where n is the length of the input string
The second iteration has a defined max iteration possible --> 26*2

Space Complexity:
O(1) since we create a hashmap for a maximum of  26 * 2 characters regardless of the input string.

'''

class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """

        leng = 0
        hm = {}
        for idx in range(len(s)):
            if s[idx] not in hm:
                hm[s[idx]] = 1
            else:
                hm[s[idx]] += 1

        odd_flag = 0
        for key in hm:

            if hm[key] % 2 == 0:
                leng += hm[key]
            else:
                leng = leng + (hm[key] - 1)
                odd_flag = 1

        return leng + odd_flag
