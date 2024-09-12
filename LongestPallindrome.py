# Time Complexity : O(N)

# Space Complexity : O(N)

# Did this code successfully run on Leetcode :
# Yes

# Any problem you faced while coding this :
# No

# Your code here along with comments explaining your approach
#  i have used a HashSet in which I add the character if not present and if present I increment the global counter length
# by 2 and remove the character. If HashSet is not empty after traversal , add 1 to length.

class Solution:
    def longestPalindrome(self, s: str) -> int:
        if (s == None or len(s) == 0):
            return 0

        hashset = set()
        length = 0
        for char in s:
            if char in hashset:
                length += 2
                hashset.remove(char)
            else:
                hashset.add(char)
        if hashset:
            length += 1
        return length
