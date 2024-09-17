#Time Complexity :  O(N)  # iterate through every element and calculate occurences
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this : no

from collections import Counter
class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        hashset =  set()
        count = 0
        for k in s:
            if k not in hashset:
                hashset.add(k)
            else:
                hashset.remove(k)
                count = count+2
                
        if len(hashset) ==0:
            return count
        else:
            return count+1
                
                
         