#TimeComplexity:O(N)
#SpaceComplexity: Space for set
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        Set=set()
        Len=0
        for i in s:
            if i in Set:
                Len+=2
                Set.remove(i)
            else:
                Set.add(i)
        if len(Set)==0:
            return Len
        else:
            return Len+1
