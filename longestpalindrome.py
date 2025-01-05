class Solution:
    def longestPalindrome(self, s: str) -> int:
        if not s:
            return 0
        hashmap={}
        cnt = 0
        for ch in s:
            if ch not in hashmap:
                hashmap[ch] = 1
            else:
                del hashmap[ch]
                cnt +=2
        if hashmap:
            return cnt+1
        return cnt
        