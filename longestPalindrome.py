"""
Time complexity: O(n) to iterate through all the characters
Space Complexity: O(1) At a time hset can hold upto 26 chars
"""
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hset = set()
        total = 0
        res = False
        for c in s:
            if c not in hset:
                hset.add(c)
            else:
                total+=2
                hset.remove(c)
        return total if not hset else total+1

        