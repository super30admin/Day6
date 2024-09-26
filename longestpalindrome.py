class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        d=set()
        count=0
        for i in s:
            if i not in d:
                d.add(i)
            else:
                count+=2
                d.remove(i)
        return count if not d else count+1
       # if not d:
        #    return count
        #else:
         #   return count+1
            