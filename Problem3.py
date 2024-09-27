"""
// Time Complexity : o(n), where n is the number of elements in s
// Space Complexity : o(n), size of set
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
"""

class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        """USING SET"""
        ch_set = set() # keeping track in a set
        
        count = 0
        
        for ch in s:
            if ch in ch_set:
                ch_set.remove(ch) #if char already exists in the set, remove it and add 2 to the counter, takes care of chars which in even numbers and can be used to create a palindrome

                count += 2
            else:
                ch_set.add(ch) #else, add to the set
                
        if ch_set: # i the end if the set isn't empty, that means there are chars in odd numbers
            count +=1 # add 1 to count as 1 char can be used
        
        return count
        