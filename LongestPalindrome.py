# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def longestPalindrome(self, s: str) -> int:
        count = 0
        odd = 0
        dict = {}
        if len(s) == 1:
            return 1
        # Iterate through the string
        for char in s:
            # If the Character does not exist in the dict, add it
            if char not in dict:
                dict[char] = 1
            # If it exists, increment it
            elif char in dict:
                dict[char] += 1
            # If the lenght is even
            if dict[char] % 2 == 0:
                count += 2
                odd -= 1
            # If length is odd
            else:
                odd += 1
        # The length is odd, need to add another character
        if odd > 0:
            count += 1

        return count

        
