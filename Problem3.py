# Problem 3: Longest Palindrome

# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

# Approach:
# Use a set to track seen characters, allowing for efficient checks. 
# For each character, if it's new, add it; if it's seen, remove it and increase the result by 2. 
# Finally, if any characters remain in the set, add 1 to account for a potential center character.

class Solution:
    def longestPalindrome(self, s: str) -> int:
        result = 0 
        seen = set()
        for c in s:
            if c not in seen:
                seen.add(c)
            else:
                result+=2
                seen.remove(c)
        if len(seen) > 0:
            result+=1
        return result