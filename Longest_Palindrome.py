#// Time Complexity :O(n) #n is the length of string
#// Space Complexity :O(1)
#// Did this code successfully run on Leetcode :yes
#// Any problem you faced while coding this :no

class Solution:
    def longestPalindrome(self, s: str) -> int:
        if(s==None):
            return 0                                                                     
        count=0        
        hashset=set()
        for i in s:
            if i not in hashset:
                hashset.add(i)
            else:
                count=count+2
                hashset.remove(i)
        if(hashset==set()):
             return count
        else:
            return count +1