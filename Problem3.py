#Time complexity: O(n) where n is the number of characters in  the input string
#Space complexity: O(n) where n is the number of characters in  the input string
#Does it run on leetcode ? : yes
#Approach: We can use all the even occuring leters, but only one odd occuring letter. So we need to keep track of all
#odd letters for palindrome. 
class Solution(object):
    # function to find the length of longest palindrome 
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        odd = set()
        for c in s:
            if c not in odd:
                odd.add(c)
            else:
                odd.remove(c)
        return len(s)-len(odd)+1 if len(odd)>0 else len(s)
        