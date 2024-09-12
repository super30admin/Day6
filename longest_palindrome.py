# Time Complexity: O(n)
# Space Complexity: O(1)
# Ran on Leetcode: Yes

class Solution:
    def longestPalindrome(self, s: str) -> int:
        if len(s) == 0:
            return 0
        h_set = set()
        out = 0
        for elem in s:
            if elem in h_set:
                out += 2
                h_set.remove(elem)
                
            else:
                h_set.add(elem)
        return out + 1 if len(h_set) else out