# Time complexity = O(N)
# Space COmplexity = O(1)
# Yes, it ran on Leetcode

class Solution(object):
    def longestPalindrome(self, s):
        hashset = set()
        max_length = 0
        for i in range(len(s)):
            if s[i] in hashset:
                hashset.remove(s[i])
                max_length += 2
            else:
                hashset.add(s[i])
        if len(hashset) != 0:
            max_length += 1

        return max_length