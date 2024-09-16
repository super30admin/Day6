# TC: O(n) looping through each character
# SC: O(1) in worst case size will be 26
# LC: Yes
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashmap = dict()
        for c in s:
            if c not in hashmap:
                hashmap[c] = 1
            else:
                del hashmap[c]
        if len(hashmap) > 1:
            return len(s) - len(hashmap) +1
        return len(s)