# TC: O(N) where N is the length of the input string
# SC: O(1) since we will be needing just constant space to store all characters in set from a-z


class Solution:
    def longestPalindrome(self, s: str) -> int:
        hset = set()
        count = 0
        for i in range(len(s)):
            if not s[i] in hset:
                hset.add(s[i])
            else:
                count += 2
                hset.remove(s[i])
        
        if len(hset) != 0:
            count += 1
        
        return count
