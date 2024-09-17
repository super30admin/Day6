# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# Using hashmap to store each character
# If the character is already in hashmap then remove that character and increase the count by 1
# If the hashmap is empty that means there are even number of characters in the string otherwise add 1 to the count


class Solution:
    def longestPalindrome(self, s: str) -> int:
        dict = {}
        count = 0
        for i in range(len(s)):
            if s[i] not in dict:
                dict[s[i]] = 1
            else:
                del dict[s[i]]
                count += 1

        if not dict:
            return count * 2
        else:
            return count * 2 + 1