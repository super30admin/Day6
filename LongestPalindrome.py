# Time Complexity : O(N + K) N = length of string. K = Number of keys in dictionary
# Space Complexity : O(N)

class Solution:
    def longestPalindrome(self, s: str) -> int:
        res = 0
        
        freqDict = defaultdict(int)
        
        for char in s:
            freqDict[char] += 1

        for key, value in freqDict.items():
            res += (value//2)*2
        
        if res < len(s):
            res += 1
        
        return res