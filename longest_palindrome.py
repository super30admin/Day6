class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        dict_s = {}
        count = 0
        for i in s:
            if i in dict_s:
                dict_s.pop(i)
                count+=2
            else:
                dict_s[i]=1
        if dict_s:
            return count+1
        return count