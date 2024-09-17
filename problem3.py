"""
time: O(n)
space:O(n)
Leet: accepted 79.86 percentile
Problems faced: None
"""

class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        d = {}

        oneflag = 0 #checks for odd num of occurences
        max_len = 0 #maintains max length
        for i in range(len(s)):
            if s[i] not in d:
                #adds char if not present
                d[s[i]] = 1
                oneflag += 1
            else:
                #maintains count
                d[s[i]] += 1
                if d[s[i]] == 1:
                    oneflag += 1

            if d[s[i]] == 2:
                #if count reaches 2, adds to max
                #and reduces oneflag
                #then resets count to 0
                oneflag -= 1
                max_len += 2
                d[s[i]] = 0

        if oneflag == 0:
            return max_len
        else:
            return max_len + 1
