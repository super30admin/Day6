# Time Complexity : O(n) [n = length of the input list]
# 
# Space Complexity : O(1) [The maximum length of the set is 52(considering all uppercase and lowercase alphabets)]
# 
# Did this code successfully run on Leetcode : Yes
# 
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
# 1. Iterate over each character in the string.
# 2. Add the character it in the char_set if it is not already present
# 3. If the character is already present in the set increment the length by 2 and remove the character from the set
class Solution:
    def longestPalindrome(self, s: str) -> int:
        if not s: return 0
        char_set = set()
        length = 0
        for char in s:
            if char in char_set:
                length += 2
                char_set.remove(char)
            else:
                char_set.add(char)
        # check if the char_set is empty or not
        # if it empty then there was no character in the string with frequency 1
        # if it is non empty, then one the character in the char_set can be used to form a palindrome
        return length if len(char_set) == 0 else length+1