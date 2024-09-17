"""
Leetcode - https://leetcode.com/problems/longest-palindrome/
TC- O(N), SC- O(N)
Lecture - https://youtu.be/2riNDAD4GgM


Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

Example 1:

Input: s = "abccccdd"
Output: 7
Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.

Example 2:
Input: s = "a"
Output: 1

Example 3:
Input: s = "bb"
Output: 2


Constraints:

1 <= s.length <= 2000
s consists of lowercase and/or uppercase English letters only.
"""

'''
Idea - The longest palindrome would be total number of pairs in string plus a single element. 
Check count of each unique alphabet, and if a pair is found add 2 to your answer. 
In the end, if look for a single element you can add. Use hash map for constant lookup. 
'''
class Solution:
    def longestPalindrome(self, s):
        result = 0
        dict_len = 0
        dict_ = {}
        for char_ in s:
            if char_ not in dict_:
                dict_[char_] = 1
                dict_len += 1
            else:
                # pair exists
                del dict_[char_]
                dict_len -= 1
                result += 2

        # single character exists in hash map
        if dict_len > 0:
            result += 1

        return result
