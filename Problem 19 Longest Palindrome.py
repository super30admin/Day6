# Did this code successfully run on Leetcode: Yes
# Time Complexity: O(n)
# Space Complexity: O(1) since mapper size is constant with max size of 52 (small & capital letters)
# Logic: count the occurance of each character, only 1 odd character can come in palindrome others has to be even only.

class Solution:
    def longestPalindrome(self, s: str):
        mapper = {}
        count = 0
        isOdd = False
        for i in s:
            if i in mapper:
                mapper[i] += 1
            else:
                mapper[i] = 1
        for i in mapper:
            if not isOdd and i%2 == 1:
                isOdd = True
            count += (mapper[i]//2) * 2
        if isOdd:
            count += 1
        return count
