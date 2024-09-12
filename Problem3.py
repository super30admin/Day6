# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : 
# Your code here along with comments explaining your approach
class Solution:
    def longestPalindrome(self, s: str) -> int:
        counter = {}
        count = 0
        for letter in s:
            if letter not in counter:
                counter[letter] = 1
            elif counter[letter] == 1:
                counter[letter] -= 1
                count += 2
            else:
                counter[letter] += 1
        if 1 not in counter.values():
            return count
        else:
            return count + 1
