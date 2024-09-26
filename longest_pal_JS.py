#Running time complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hmap = {}
        c = 0
        for i in s:
            if i in hmap:
                del hmap[i]
                c +=2
            else:
                hmap[i]= 1
        if hmap:
            return c+1
        return c