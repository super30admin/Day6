"""
Time complexity - O(n)
Space complexity - O(1)
"""
class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        count = 0
        hashset = set([])
        for i in s:
            if i in hashset:
                count += 2
                hashset.remove(i)
            else :
                hashset.add(i)
        
        if len(hashset) > 0 :
            count += 1
        
        return count
                
        
