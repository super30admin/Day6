# Time Complexity : O(n) - n is length of s
# Space Complexity : O(1) - As size of set would be constant : 26 (a to z and A to Z)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

"""
Palindrome of even length would have even number of characters.
Palindrome of even length would have even number of characters for all but one,
as middle character will be there only once.

So, we will maintain a set and traverse through the string,
If character is not there in the set, add it to the set
If character is there in the set, that means we found pair which could used in our
target palindrome string.So, remove that character from the set and increment the len counter by 2.


After the traversal is done, if set is empty then return the counter (even palindrome)
After the traversal is done, if set is not empty that means it contains
characters for which no pair was found, so return counter + 1 (odd palindrome)
"""

def longestPalindrome(s):
    """
    :type s: str
    :rtype: int
    """

    char_set = set()
    length = 0
    for i in range(0, len(s)):
        if s[i] in char_set:
            length += 2
            char_set.remove(s[i])
        else:
            char_set.add(s[i])

    if len(char_set) != 0:
        return length + 1
    else:
        return length