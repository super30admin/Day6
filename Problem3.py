'''
Time Complexity: O(n) where n is length of the String
Space Complexity: O(1)
Run on Leetcode: YES
'''
class Solution:
    def longestPalindrome(self, s: str) -> int:
        cSet = set()
        result = 0
        for index in range(len(s)):
            if s[index] in cSet:
                result += 2
                cSet.remove(s[index])
            else:
                cSet.add(s[index])
        if len(cSet) == 0:
            return result
        return result + 1