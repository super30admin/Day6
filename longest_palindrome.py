# tc O(N) avg O(1)
# sc O(N)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashset = set()
        res = 0 
        for i in s:
            if i not in hashset:
                hashset.add(i)
            else:
                res += 2
                hashset.remove(i)
        if len(hashset) != 0:
            res = res +1 
        return res        
        