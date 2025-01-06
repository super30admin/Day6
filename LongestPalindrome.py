# Time Complexity : O(n), where n is the number of characters in given string
# Space Complexity : O(1), because we will store max 52 characters in the hashset
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA 

# Your code here along with comments explaining your approach:
# - hashset is used to solve this problem
# - the idea is that we need atleast 2 occurences of a character for it to be in the longest palindrome
# - so we traverse the string and add every character in the hash set
# - if that character if already present in the hash set, it means we have 2 occurences (previous one and this one)
# - so we remove it from the hash set and add 2 to count which is the length of the longest palindrome
# - next, after we have traversed through the string, we check if there are any elements pending in the hash set
# - it means these were odd occurences, so we can use 1 of them as the center of the palindrome, so we add 1 to count

class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """

        # we can also check the length of s is 1 and return 1
        if s is None:
            return 0

        count = 0
        # initializing hashset
        hset = set()

        # traversing every character
        for char in s:
            # if it is already present in hashset
            if char in hset:
                # remove it from the hashset
                hset.remove(char)
                # add add 2 to the count
                count += 2
            else:
                # add it to the hash set
                hset.add(char)
        
        if hset:
            # odd occurence for the center of the palindrome
            count += 1
        
        return count
            

         