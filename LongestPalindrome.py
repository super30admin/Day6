# Time Complexity: O(n), where n is the length of the input string `s`, as we iterate through the string once.
# Space Complexity: O(1), as the set can have at most 52 characters (lowercase and uppercase English letters).
# Approach: Used a set to track characters and calculated the length of the longest palindrome by pairing characters while allowing at most one unpaired character.

class Solution:
    def longestPalindrome(self, s: str) -> int:
        if s == None: 
            return 0
        count = 0
        myset = set()
        for i in range(len(s)):
            c=s[i]
            if c in myset:
                count = count + 2
                myset.remove(c)
            else:
                myset.add(c)
        if myset:
            count = count + 1
        return count
            