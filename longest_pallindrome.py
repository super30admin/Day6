'''
Implementation: Make a set to store the letters. While inserting check if letter already present
in the set. If yes, remove the letter from the set. If no, add the letter to the set.
In the end, 
if set size = 1, the string is a pallindrome with 1 middle letter.
if set size = 0, the string is a pallindrome with no middle letter
if set size > 1, pallindrome length = len(s) - len(set) + 1

Time complexity: O(n)
Space complexity: O(n)
'''
class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        letters_set = set()
        for i in range(len(s)):
            if s[i] in letters_set:
                letters_set.remove(s[i])
            else:
                letters_set.add(s[i])
        if len(letters_set) <= 1: # No element or center element remains i.e. pallindrome
            return len(s)
        else:
            return len(s) - len(letters_set) + 1
        
        ## Aproach 2
        # letters_set = set()
        # size = 0
        # for i in range(len(s)):
        #     if s[i] in letters_set:
        #         letters_set.remove(s[i])
        #         size += 2
        #     else:
        #         letters_set.add(s[i])
        # if len(letters_set) != 0: # No element or center element remains i.e. pallindrome
        #     return size + 1 # Does not matter how many elements left in set (no one has a pair), we can only take one as the center element
        # else:
        #     return size