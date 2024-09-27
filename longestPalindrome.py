# Time complexity -> O(N)
# Space complexity => O(1)

class Solution:
    def longestPalindrome(self, s: str) -> int:
        if not s:
            return 0
        
        hashSet = set()
        count = 0 
        
        for i in range(len(s)):
            if s[i] in hashSet:
                count+= 2
                hashSet.remove(s[i])
            else:
                hashSet.add(s[i])
                
        
        if hashSet:
            count += 1
        return count
                
        