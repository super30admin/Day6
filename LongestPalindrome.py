"""
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""
class Solution:
    def longestPalindrome(self, s: str) -> int:
        # Hash set to add elements
        mainDict = set()
        count = 0
        if len(s) == 0:
            return 0
        else:
            # If there exists and alphabet then remove it and add
            # 2 to the count as there would be 2 occurences and
            # remove from the Hashset. If at last the Hashset is empty
            # then return count else add 1
            for i in range(len(s)):
                if s[i] not in mainDict:
                    mainDict.add(s[i])
                else:
                    mainDict.remove(s[i])
                    count += 2
            if len(mainDict) != 0:
                count += 1
            return count