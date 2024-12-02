'''
Time Complexity : O(n)  Iterate through the string

Space Complexity : O(1)

Did this code successfully run on Leetcode : Yes

Explanation: Create Hashmap (dictionary in  python)
Since we know that every palindrome is of the form \w^n(middle)\w^n
where n is any number as long as left and right are same.
We use this with the help of dictionary, we iterate through the dictionary and
whenever we see a new character we add it to the dictionary, if we see the same
character again we remove it from the dictionary.
After adding and removing if we still see a single character in the dictionary or if the
dictionary is empty we return the length of the string as the whole string is the longest
palindrome else we return the length of the string - length of the dictionary + 1 as the
non characters not in the palindrome are in the dictionary.
'''
class Solution:
    def longestPalindrome(self, s: str) -> int:
        dict1 = {}
        for i in s:
            if i not in dict1.keys():
                dict1[i] = i
            else:
                del dict1[i]

        if len(dict1) < 1:
            return len(s)
        else:
            return len(s) - len(dict1) + 1

