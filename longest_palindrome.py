# // Time Complexity : # we will have O(n)
# // Space Complexity :O(n)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : no
class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        charset=set()
        leng=0
        
        for char in s:
            #if char already in set then update the len by 2  and remove it from set
            if char in charset:
                leng+=2
                charset.remove(char)
            else:
                charset.add(char)
                
        return leng+1 if len(charset)>0 else leng
                