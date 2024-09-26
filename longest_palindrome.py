# Did this code successfully run on Leetcode : YES

# TC: O(N) : one traversal over s
# SC: O(1) : constant space: store all upper/lower-case letters and a frequency-count mapping

# Approach
# count frequency of all chars
# if count of i is even -> add it to result
# if count of i is odd -> extract highest possible even from it
# check if result == len(s)
# if it is, we can use all of s to shuffle into palindrome
# else, add 1

# basically a palindrome will be either 'aabb' or 'aa-x-bb'
# first is even number of all chars
# second is even number of all chars except the middle
# if ans == len(s) then even case
# else we need to account for the middle -> we can use any of the remaining chars with frequency 1


from collections import Counter
class Solution:
    def longestPalindrome(self, s: str) -> int:
        mapping = Counter(s)
        ans = 0
        for k in mapping:
            if mapping[k] % 2 == 0:
                ans += mapping[k]
            else:
                ans += (mapping[k]//2)*2
        if ans == len(s):
            return ans
        else:
            return ans+1