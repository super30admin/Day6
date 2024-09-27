#longest_palindrome
# time complexity: O(N)
# space complexity: O(1)
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NA

class Solution:
    def longestPalindrome(self, s: str) -> int:
        charmap = {}
        count = 0
        for ch in s:
            if ch in charmap:
                count += 2
                del charmap[ch]
            else:
                charmap[ch] = 1
        
        if len(charmap) > 0:
            return (count + 1) 
        else: 
            return count 