# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach
# The longest possible palindrome is :-
# Sum(even_occuring_chars) + Sum(odd_occuring_chars - 1) + 1(if max_odd_char > 1)

class Solution: 
    def longestPalindrome(self, s: str) -> int:
        freq = Counter(s)
        res = 0
        max_odd = 0
        for v in freq.values():
            if v % 2 == 0:
                res += v
            else:
                if v > 1:
                    res += v - 1
                max_odd = max(max_odd, v)
        
        if max_odd:
            return res + 1
        else:
            return res