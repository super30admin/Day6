# Hashing-2
## Problem3 (https://leetcode.com/problems/longest-palindrome)

# Approach
# create an empty hashset. traverse through the string and check if the character is present in the hashset. If yes, increase count by 2 and remove the element from hashset
# If element is not present in the hashset, add it.
# Before returning check if the hashset is empty. If yes, return count else return count + 1

# Time Complexity: O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def longestPalindrome(self, s: str) -> int:
        cnt = 0
        hset = set()
        for i in s:
            if i not in hset:
                hset.add(i)
            else:
                cnt += 2
                hset.remove(i)
        if hset:
            return cnt+1
        else:
            return cnt