#TC: O(n)
#SC: O(1) as max will be O(26) which is const.
class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        counter=0
        HashSet=set()
        for i in s:
            if i in HashSet:
                counter+=2
                HashSet.remove(i)
            else:
                HashSet.add(i)
        if HashSet:
            counter+=1
        return counter