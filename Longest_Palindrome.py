class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        charSet = set()
        result = 0
        
        # Iterate through string
        for char in s:
            
            # If already present in hashset, add the pair to the result and remove from hashset
            if char in charSet:
                charSet.remove(char)
                result += 2
                
            # Mark the character as observed by adding to the hashset
            else:
                charSet.add(char)
        
        return result+1 if charSet else result

### Complexity Analysis

# Time Complexity: O(N) --> Iterating through input string
# Space Complexity: O(1) --> Even though hashset occupies space, it only stores uppercase and lower characters which will be a constant number.