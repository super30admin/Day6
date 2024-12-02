"""
Given a string s which consists of lowercase or uppercase letters, 
return the length of the longest palindrome that can be built with those letters.

Input: s = "abccccdd"
Output: 7

Time Complexity: O(n)
Space Complexity: O(1) since number of characters in s is at most 26
"""


def longest_palindrome(s):
    if len(s) == 1:
        return True

    char_set = set()
    count = 0
    for char in s:
        if char in char_set:
            count += 2
            char_set.remove(char)
        else:
            char_set.add(char)

    return count + 1 if len(char_set) > 0 else count


print(longest_palindrome("abccccdd"))
