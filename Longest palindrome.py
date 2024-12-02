# Time Complexity = O(n) 
# Space Complexity = O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
import collections
class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        res = 0
        
        # Create a dictonary with characters as keys and counts as values
        for v in collections.Counter(s).values():
            
            # check for even counts in the values and add the even counts to res
            res += v // 2 * 2
            
            # add the unique center
            if res%2 == 0 and v%2==1:
                res += 1
        
        return res
        