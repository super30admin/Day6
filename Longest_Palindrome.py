# We use a hashmap to count the occurrences of each character in the string. For each character with an even frequency, 
# we add its count to the palindrome length, and for characters with odd frequencies, we add (count - 1) to the length to make them even. 
# If there are any characters with odd frequencies, we can place one of them in the center of the palindrome, so we add one to the final length.

# Time Complexity : O(n), where n is the length of s, as we count characters and iterate through them once.
# Space Complexity : O(1), since we only store 52 possible letters (uppercase and lowercase English letters).
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

from collections import Counter

class Solution:
    def longestPalindrome(self, s: str) -> int:
        char_count = Counter(s)
        length = 0
        odd_found = False

        for count in char_count.values():
            # Add even counts directly, and for odd counts add the largest even part (count - 1)
            if count % 2 == 0:
                length += count
            else:
                length += count - 1
                odd_found = True  # Mark that we have an odd count to place in the middle

        # If there's any odd count, we can place one odd character in the middle of the palindrome
        if odd_found:
            length += 1

        return length
