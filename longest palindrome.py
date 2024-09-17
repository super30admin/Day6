# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    
    def longestPalindrome(self, s: str) -> int:
        smap = set()
        count = 0
        for i in range(len(s)):
            if s[i] in smap:
                count = count+2
                smap.remove(s[i])
            else:
                smap.add(s[i])
                
        if len(smap)==0:
            return count
        else:
            return count+1