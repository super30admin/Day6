#Time complexity: O(n)
#Space complexity: O(1)

class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashset = set()
        ans = 0
        
        for i in s:
            if i in hashset:
                ans += 2
                hashset.remove(i)
            else:
                hashset.add(i)
                
        if hashset:
            ans += 1
            
        return ans
