"""Approach - We'll use a hashset. Maintain a result_count and traverse through the string and see if the character is already present. If the
value is already present, then add 2 to the result and remove that value from the set. If the value is not present, then
just add it to the hashset."""
class Solution:
    def longestPalindrome(self, s: str) -> int:

        # Time Complexity = O(n)
        # Space Complexity = O(1) as the set cannot exceed 26 size (if only lowercase letters)

        # Creating a set to store the elements
        hashset = set()
        result = 0
        for i in range(len(s)):
            # If the element is present, add 2 to result and remove
            if s[i] in hashset:
                result += 2
                hashset.remove(s[i])
            # If the element is not present, add it to the set
            else:
                hashset.add(s[i])

        # At the end, if the hashset is not empty, we can use any of them to add to the longest even palindrome
        if len(hashset) != 0:
            return result + 1
        # If it's empty, then just return the result
        else:
            return result