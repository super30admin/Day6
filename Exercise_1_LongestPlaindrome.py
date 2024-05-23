# Time Complexity :

# O(N) , need to traverse each char in string


# Space Complexity :  

# O(1), since that max char for either storing into Hashset will be 26, irrespective of string size


# Approach:
# Here we create hashSet to keep track of pair of same chars, if any cahracter doesn't 
# have a pair character, then it will finally stay in the HashSet, and we can increment 
# the final count by 1.

class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """

        #HashSet to store odd values
        oddSet = set()

        count = 0

        for c in s:
            if c in oddSet:
                count = count + 2
                oddSet.remove(c)
            else:
                oddSet.add(c)
        
        if oddSet:
            count =count + 1

        return count
