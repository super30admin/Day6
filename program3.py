# Time complexity - O(N)
# Space complexity - O(N)
# Executed in leetcode - yes

class Solution:
    def longestPalindrome(self, s: str) -> int:
        count = 0
        hashset = set()
        for char in s:
            if char in hashset:
                count += 2
                hashset.remove(char)
            else:
                hashset.add(char)
        if hashset:
            count += 1
            
        return count