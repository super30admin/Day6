# Time Complexity :O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach
from collections import Counter
class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        #count for each letter how many times it happened
        myCounts = Counter(list(s))
        maxOdd = 0
        maxLength=0
        odd = False
        for i in myCounts.values():
            #if a letter happened an even number of times add its occurances to the max length
            if i%2 ==0:
                maxLength+=i
            # else add odd occurances -1 and know that there is an odd number
            else:
                odd = True
                maxLength +=i-1
        #return max length +1   if there was an odd number else return maxlength       
        if odd:
            return maxLength+1
        else:
            return maxLength
        