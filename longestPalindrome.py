#O(n)time and O(n) space solution, n is the number of elements in the string
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashset = set()
        result = 0
        for i in range(len(s)):
            if s[i] in hashset:
                result += 2
                hashset.remove(s[i])
            else:
                hashset.add(s[i])
        
        if len(hashset) != 0:
            result += 1
        return result