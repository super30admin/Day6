""" Time Complexity : O(n)
 Space Complexity : O(n)
 Did this code successfully run on Leetcode :Yes
 Any problem you faced while coding this : No 
"""

class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        char_set = set()
        count = 0
        
        for i,char in enumerate(s):
            
            if char not in char_set :
                char_set.add(char)
                
            else:
                count += 2
                char_set.remove(char)
                
        if char_set:
            count += 1
            
        return count