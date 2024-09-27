#Time Complexity : O(N)
#Space Complexity : O(N) for storing the elements in hashmap
class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        d = {}
        count = 0
        for i in s:
            if  i in d:
                d[i]+=1
            else:
                d[i] = 1
            
            if d[i] == 2:
                count+=d[i]
                del d[i]
            
        if len(d) != 0:
            count+=1
        else:
            return count
        
        return count
                