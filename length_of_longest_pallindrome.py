"""
Hashing-2

Problem3 (https://leetcode.com/problems/longest-palindrome)

Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.

Time Complexity : O(n)
Space Complexity : O(1) where max can be 104 including twice of lower and upper case
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Your code here along with comments explaining your approach:
Two Approaches:
1. HashMap - We're iterating through s and keeping track of its count in hash map. Once the iteration is done we iterate over hash_map values and check if's an even if yes then we add it
to our length variable which we're using to keep track of the longest pallindrome length. If it's odd, we're adding the length-1 but we're setting a flag is_odd_present as True and after
the values iteration is completed. We're returing length + 1 if is_odd_present is True since we can form longest odd pallindrome else we have to return length only as it's even pallindrome.
2. HashSet - We're iterating through s and storing it in hash_set and whenever we're founding the same char present in hash_set we're popping it 
and adding 2 to the length variable which we're keeping track to store the length of longest pallindrome. If we don't find it in hash_set we insert 
it into hash_set. After completing iteration of all elements, we check if hash set is empty, if it's not then we add +1 to the length since we can
form odd longest pallindrome. 
"""

# Approach 1
class Solution:
    def longestPalindrome(self, s: str) -> int:
        if not s or len(s) == 0:
            return 0

        hash_map = {}
        length = 0
        is_odd_present = False

        for letter in s:
            if letter not in hash_map:
                hash_map[letter] = 1
            else:
                hash_map[letter] += 1

        for value in hash_map.values():
            if value % 2 == 0:
                length += value
            else:
                length += value - 1
                is_odd_present = True

        if is_odd_present:
            length += 1

        return length

# Approach 2
class Solution:
    def longestPalindrome(self, s: str) -> int:
        if not s or len(s) == 0:
            return 0

        hash_set = set()
        length = 0

        for letter in s:
            if letter not in hash_set:
                hash_set.add(letter)
            else: 
                length += 2
                hash_set.remove(letter)
        
        if len(hash_set):
            length += 1

        return length
        