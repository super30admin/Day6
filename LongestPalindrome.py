class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashSet=set()
        count=0
        for i in range(len(s)):
            if s[i] not in hashSet:
                hashSet.add(s[i])
            else:
                count+=2
                hashSet.remove(s[i])
        
        if len(hashSet)>0:
            count+=1
        
        return count

# Time Complexity: O(n)
# Space Complexity: O(1) as character set is always fixed