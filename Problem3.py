class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        hashset = set()
        count = 0
        
        for i in s:
            if i in hashset:
                hashset.remove(i)
                count += 2
            else:
                hashset.add(i)
        
        if hashset:
            return count+1
        return count
    
#Time complexity is O(n) where n is the length of string
#Space complexity is O(1) since the max size could be 26 characters