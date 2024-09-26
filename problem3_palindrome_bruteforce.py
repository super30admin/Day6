#Brute force

class Solution:
    def longestPalindrome(self, s: str) -> int:
        singles = []
        max_len = 0
        counts = collections.Counter(s)
        for key in counts.keys():
            if counts[key]%2 != 0:
                singles.append(key)
        return (len(s)-len(singles)) + 1