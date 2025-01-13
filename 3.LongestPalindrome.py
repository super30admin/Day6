"""
Time Complexity: 0(n)
Space Complexity: 0(52) -- atmax lower and upper characters
Approach:
    Using SET
    1. Iterate the string
    2. If char not in set, add it
    3. If char is already in set, update the count by +2 and remove the char from the set
    4. At the end of the loop, if we still have char in set, just update the count by +1
"""
class Solution:
    def longestPalindrome(self, s: str) -> int:

        # approach using set
        alpha_set = set()
        resultCount = 0

        for i in range(0,len(s)):
            charS = s[i]
            
            if charS in alpha_set:
                # char alreadt exist, remove it and update count by +2
                resultCount += 2
                alpha_set.remove(charS)
            
            else:
                # add the char to the set, we don't have it or its count might be odd
                alpha_set.add(charS)
        
        # end of for loop

        # if set isn't empty
        if len(alpha_set) > 0:
            resultCount += 1

        return resultCount

        