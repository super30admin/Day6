# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :
#
#
# // Your code here along with comments explaining your approach

#Using Hashset


class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashset = set()
        count = 0
        for i in s:
            if i not in hashset:
                hashset.add(i)
            else:
                hashset.remove(i)
                count += 2

        if len(hashset) != 0:
            count += 1
        return count
