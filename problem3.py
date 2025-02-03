# Time Complexity : O(n)#
#  Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Store elements in set, if the element exists in set forms a pair, 
# remove it from set and increse count by 2. in the end if element in set 
# increase count by 1

class Solution:
    def longestPalindrome(self, s: str) -> int:
        charSet = set()
        result = 0

        for c in s:
            if c in charSet:
                charSet.remove(c)
                result += 2
            else:
                charSet.add(c)
        
        if charSet:
            result += 1
        return result
