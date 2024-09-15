# Time Complexity : O(n) n is the number of characters in a string
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Here I approached this problem using hash data structure, where I counted the each and every character number of times it appeared.
#The I iterated through each value, if it is even I added to result and it it is odd, I added maximum even number of times it appeared.
#Also at the end added one character if odd is present else returning res.




class Solution:
    def longestPalindrome(self, s: str) -> int:
        if not s:
            return 
        res = 0
        odd = 0
        for i in collections.Counter(s).values():
            if i%2 == 1:
                odd = 1
            res += (i//2)*2
        return res+1 if odd else res