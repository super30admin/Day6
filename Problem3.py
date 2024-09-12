# TimeComplexity: O(n)
# Space Complexity:O(1) worst caase 26 charset which is constant
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: no
class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        count = 0
        charSet = {}
        for char in s:
            if charSet.has_key(char):
                count += 2
                charSet.pop(char)
            else:
                charSet[char] = True
        
        if len(charSet) == 0:
            return count
        return count + 1