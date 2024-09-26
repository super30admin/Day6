# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def longestPalindrome(self, s: str) -> int:
        if not s or len(s) == 0:
            return 0
        dict_char,count = {},0
        for i in s:
            if i in dict_char:
                count+=2
                dict_char.pop(i)
            else:
                dict_char[i] = 1
        if dict_char:
            count+=1
        return count
                
            
        
