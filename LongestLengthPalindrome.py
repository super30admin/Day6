#Time Complexity: O(n)
#Space Complexity: O(1)
#Successfully ran on leetcode

class Solution:
    def longestPalindrome(self, s: str) -> int:
        a = set()
        p = 0
        for i in s:
            if i not in a:
                a.add(i)
            else:
                p+=2
                a.remove(i)
        if len(a) is 0:
            return p
        else:
            return p+1