# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        ch=set()
        count=0
        for i in range(len(s)):
            if s[i] in ch:
                ch.remove(s[i])
                count+=2
            else:
                ch.add(s[i])
        if len(ch)!=0: count+=1
        return count
            