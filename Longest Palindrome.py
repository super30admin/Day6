class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        count = 0
        k = set()
        
        for i in range(len(s)):
            if(s[i] in k):
                k.remove(s[i])
                count+=2
            else:
                k.add(s[i])
        if(k):
            count+=1
        return count
                