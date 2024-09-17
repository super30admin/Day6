# Leetcode 409. Longest Palindrome

# Time Complexity :  O(n) where n is the size of the string

# Space Complexity : O(n) where n is the size of array

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Use a hashset to store the elements. To be a palindrome check if the element is in pairs.
# If it is in pair remove it and increase count by 2.
# After the entire string is iterated over if any elements remain in hashset, add 1 to the count.

# Your code here along with comments explaining your approach

class Solution:
    def longestPalindrome(self, s: str) -> int:
        count = 0
        hashset = set()
        for letter in s:
            if letter in hashset:
                hashset.remove(letter)
                count += 2
            else:
                hashset.add(letter)
        if len(hashset) > 0:
            count += 1

        return count
