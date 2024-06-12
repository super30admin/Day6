# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

from typing import Collection


class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        output = 0

        # counter is dictonary subclass to count the hashable objects and elements are counted from an iterable
        for i in Collection.Counter(s).itervalues():
            output = output + i / 2 * 2  # pairing the common letters

            # checking if there is any value left
            if output % 2 == 0 and i % 2 == 1:
                output = output + 1

        return output
