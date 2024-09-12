class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        hashset = set()
        length = 0
        
        for char in s:
            if char in hashset:
                length += 2
                hashset.remove(char)
            else:
                hashset.add(char)
            
        if len(hashset) > 0:
            length += 1
            
        return length
    
    # Time Complexity: O(n) because the solution is one pass of s
    # Space Complexity: O(1) because only valid ascii character are used
                
        