"""
Intuition: Palindromes can be odd or even. Use the advantage of even length palindromes.
For every 2 count of a char, add 2 to the length of the maximum length.
#####################################################################
For hashing:
Time Complexity : O(N)  N = number of elements
Space Complexity : O(N) 
#####################################################################
"""
class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        hashSet = set()
        
        count = 0
        for char in s:
            
            if char not in hashSet:
                hashSet.add(char)
            
            else:
                count += 2
                hashSet.remove(char)
            
        return count if len(hashSet) == 0 else count + 1