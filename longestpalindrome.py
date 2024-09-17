##Time Complexity : O(n)
##Space Complexity : O(1)
##Did this code successfully run on Leetcode : Yes

class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        letter = {}
        for char in s:
            if char not in letter:
                letter[char] = 1
            else:
                letter[char] +=1
                
        result = 0
        o = 0
        
        if len(letter) == 1:
            return letter[s[0]]
        
        for i in letter.values():
            if i > 1:
                if i% 2 ==0:
                    result += i
                    
                else:
                    result += i-1
                    o += 1
            else:
                o += 1
        if o > 0:
            result += 1
            
        return result
                    
        