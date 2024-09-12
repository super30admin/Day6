from collections import defaultdict
class Solution:
    def longestPalindrome(self, s: str) -> int:
        dict_char = defaultdict(int)
        ans = 0 
        for char in s:
            if dict_char[char]%2:
                ans+=2
            dict_char[char]+=1
        return ans+1 if ans<len(s) else ans
    