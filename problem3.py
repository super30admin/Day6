# Time Complexity: O(n)
# Space Complexity: O(n)
# Aproach: we check calculated the count dict add count//2 * 2,
# if odd count exist we add 1 only once
from collections import defaultdict
class Solution:
    def longestPalindrome(self, s: str) -> int:
        mp = defaultdict(lambda : 0)
        odd_flag = False
        result = 0
        for ch in s:
            mp[ch] += 1
        for ch,count in mp.items():
            print(ch,count)
            if count%2 == 1:
                odd_flag = True
            result += count//2 * 2
        if odd_flag:
            result += 1
        return result