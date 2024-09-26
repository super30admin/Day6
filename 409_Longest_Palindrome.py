# Leetcode problem link : https://leetcode.com/problems/longest-palindrome/
# Time Complexity : O(n) 
#  Space Complexity : O(n)
#  Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
'''
        Basic approach : O(n2) => check for each character and add its count to a hashmap. At the end get all even counts and check if odd count value keys are also present

        Optimized approach: The main idea of this approach is to maintain a set of characters. Add the character to hashset if its not already present. If the character is already present that means even characters can form a valid palidrome and hence remove from the hashset and increase the length by 2. If only even characters are present then hashset will be empty at the end. If one or more characters are left i.e. odd characters then any one can be used to form a valid palindrome
'''
class Solution:
    def longestPalindrome(self, s: str) -> int:
        # initialize set and max length
        char_set = set()
        max_len = 0
        
        # iterate through character string
        for char in s:
            # if char is present in the set increase count by 2 (for already present character and current character) and also remove for future characters
            if char in char_set:
                max_len +=2
                char_set.remove(char)
            # else add to the set
            else:
                char_set.add(char)
        # return max length of set is empty or pick any one character with odd count and 1
        return max_len + 1 if len(char_set) > 0 else max_len