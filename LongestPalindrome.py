'''
Time Complexity - O(n) as we are iterating the whole string
Space Complexity - O(26) = O(1) as there are only 26 characters in the hashset

'''


class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashset = set()
        count = 0
        for i in s:
            if i in hashset:
                hashset.remove(i)
                count += 2
            else:
                hashset.add(i)
        if hashset:
            count += 1
        return count
