# Time Complexity : O(n)
# Space Complexity:o(n)
#  Did this code successfully run on Leetcode : Yes

class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashSet = set()
        count = 0
        for c in s:
            if c not in hashSet:
                hashSet.add(c)
            else:
                hashSet.discard(c)
                count += 2

        return count if len(hashSet) == 0 else count + 1
