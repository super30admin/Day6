# Leetcode Submission successful.
# Time Complexity = O(n)
# Space Complexity = O(1) as only upper and lower case letters allowed.
# Hashset is more optimized than hashmap in average case. Asymptotically, both same.
class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        hset = set()
        llen = 0
        for char in s:
            if char in hset:
                llen += 2   # 2 same characters found.
                hset.remove(char)
            else:
                hset.add(char)
        if len(hset) > 0:   # characters with one occurrence remain.
            return llen + 1
        return llen