class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        :space complexity : O(1) since maximum elements in hashset can be 52 
        :time complexity : O(n), n is number of char in string
        """
        hashSet = set()
        count=0
        for c in s:
            if c not in hashSet:
                hashSet.add(c)
            else:
                hashSet.remove(c)
                count=count+2
        if len(hashSet) !=0:
            count=count+1
            
        return count
                
        