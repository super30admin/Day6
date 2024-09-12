#Time Complexity : O(n)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : None

class Solution:
    def longestPalindrome(self, s: str) -> int:
        letters = {}
        longest = 0
        used_odd = False
        for char in s:
            letters[char] = letters.get(char,0) + 1
        for val in letters.values():
            if val % 2 == 0:
                longest += val
            elif not used_odd:
                longest += val
                used_odd = True
            elif val > 1:
                longest += val-1
        return longest