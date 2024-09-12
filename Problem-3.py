"""
## Problem3 (https://leetcode.com/problems/longest-palindrome)
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:

"abccccdd"


Output:

7


Explanation:

One longest palindrome that can be built is "dccaccd", whose length is 7.

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

"""

def Longest_palindrome(str):
    set1 = set()               #create set
    max=0                     # initialize max-0
    for char in str:          # ITERATE THROUGH the string
        if char in set1 :     # check if char is in set or not. if it is present in set then increment max by 2
            max=max+2         # and remove the char
            set1.remove(char)
        else:
            set1.add(char)   # if char is not present then add the char into set

    if len(set1) != 0:       # if len of set is not zero means non empty then add 1 to max , for odd palindrome
        max=max+1
    return max


print(Longest_palindrome("abccccddab"))
