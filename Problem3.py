# Time complexity : O(n)
# Space complexity : O(1) as only 26 characters is the space is used, which is a constant
# Leetcode: Solved and submitted

# The main approach is that a string is palindrome if we have even occurences of all characters or either just one char can be odd, using this logic
# we create a set, fill in the char, if occured odd number of times, removed if even, add 2 to the count, if at last after traversing the string,
# if any element is present, then we add to the count and return it, which is the largest paliindrome possible

class Solution:
    def longestPalindrome(self, s: str) -> int:
      
        # created an empty set to store the characters and it's count
        sets = set()
        
        count = 0
        
        # traversing through the given string
        for i in range(len(s)):
          
            c = s[i]
            
            # check if the character is present in the set, if yes then add 2 to the final count, and also removed the character from the set
            if c in sets:
                count+=2
                sets.remove(c)
            else:
                # if not present, then add the char to the set
                sets.add(c)
        
        # if the set is not empty, then add one to the count
        if sets:
            count+=1
            
        # return the final count
        return count
