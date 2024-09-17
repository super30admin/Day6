"""
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

Constraints:

1 <= s.length <= 2000
s consists of lowercase and/or uppercase English letters only.

"""

# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on leetCode : Yes
# Any problem you faced while coding this : No

from typing import List

class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        set1 = set()
        result = 0
        
        for i in s:
            if i in set1:
                result += 2
                set1.remove(i)
            else:
                set1.add(i)
                
        if set1:
            result += 1
        
        return result