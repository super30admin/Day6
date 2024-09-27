    
# Time Complexity : O(n)
# Space Complexity : O(n) - HashSet. To be precise, it is O(52) : A-Z and a-z

class Solution:
    def longestPalindrome(self, s: str) -> int:
        # Store the each character
        hashSet = []
        palindromeLength = 0
        
        for i in range(len(s)):
            # If occurred again, pop it and increase the length of palindrome
            if s[i] in  hashSet :
                # even times occurred
                palindromeLength += 2
                # remove the element
                hashSet.remove(s[i])
            else:
                # Add the new character into the hashmap
                hashSet.append(s[i])
 
        # No odd occurrences of character (all are of even length)  
        if len(hashSet) == 0 :
            return  palindromeLength
        
        # Odd count characters , we can place at center. So increase count by 1 
        else: 
            return palindromeLength  + 1
        
        
        
                