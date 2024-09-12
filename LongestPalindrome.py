# Time complexity : O(n)
# Space complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : The main logic of handling the odd occurrences was not intuitive


import collections


class Solution:
    def longestPalindrome(self, s: str) -> int:
        hmap = collections.Counter(s)
        singleCharFound = 0
        result = 0

        for val in hmap.values():
            if val % 2 == 0:
                result += val
            else:
                result += val-1
                singleCharFound = 1

        if singleCharFound:
            result += singleCharFound

        return result


solution = Solution()
print(solution.longestPalindrome("abccccdd"))
print(solution.longestPalindrome("a"))
