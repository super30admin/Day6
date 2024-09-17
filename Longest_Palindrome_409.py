## Problem3 (https://leetcode.com/problems/longest-palindrome)


# Time Complexity: O(n) - Since we are traversing the array for entering each character in the dictionary.
# Space Complexity: O(n) - Using hashmap
# Leetcode sum solved successfully? : Yes
# Code:

class Solution:
    def longestPalindrome(self, s: str) -> int:
        char_dict = {}
        for character in s:  # Traverse each character and then add it in the dictionary
            if character in char_dict:
                char_dict[character]+=1
            else:
                char_dict.update({character:1})
                
        maximum_length = 0
        odd_character_count = 0
                
        for key,value in char_dict.items():
            if value % 2 == 0:          # If count of character is even , we simply add it
                maximum_length = maximum_length + value
            else:
                maximum_length = maximum_length + value - 1   # If odd , we subtract it by 1 to bring it into even  
                odd_character_count = 1 # Then add one if odd's are only 1
        
        return maximum_length + odd_character_count

# Approach: In this problem, we first add each character and its count in the string in the dictionary. 
#           We then check if the count of character is even, then we include all the occurences of that character
#           If odd, then we subtract it by 1 to make it even and then add 1 finally in the total count
