# Time Complexity : O(n)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No
class Solution:
    def longestPalindrome(self, s: str) -> int:

        setForPair = set()
        longest = 0
        for i in range(len(s)):
            if s[i] not in setForPair:
                setForPair.add(s[i])
            else:
                longest+=2
                setForPair.remove(s[i])

        if setForPair:
            longest+=1

        return longest
                


        