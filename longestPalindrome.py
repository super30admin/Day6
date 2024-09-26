# // Time Complexity : O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :
#
#
# // Your code here along with comments explaining your approach
#

class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        # set to add all the characters encountered which do not have a pair to form palidrome yet
        palindrome_set = set()
        count = 0

        for i in s:
            # checking if the alphabet has been encountered
            if i in palindrome_set:
                # if encountered we found a pair to form palidrome hence adding 2 to count
                count += 2
                # as we have formed a pair for the one in the set we can remove from the set
                palindrome_set.remove(i)
            else:
                palindrome_set.add(i)
        # if palindrome_set has remaining alphabets that do not have pair we can count it once to put in the middle
        # of palindrome string
        if palindrome_set:
            count += 1

        return count
