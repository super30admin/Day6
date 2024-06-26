'''
## Problem3 (https://leetcode.com/problems/longest-palindrome)

Time Complexity : O(n)
Space Complexity : O(1) since total number of alphabets is 26
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

'''

class Solution:
  def longestPalindrome(self, s: str) -> int:
    if not s or len(s) == 0:
      return 0

    # create a hashmap of character occurences
    charCounts = {}
    for char in s:
      if char in charCounts:
        charCounts[char] += 1
      else:
        charCounts[char] = 1

    # the longest palindrome can be made using:
    # all even count characters
    # all odd count characters (if any) with 1 less (to make the count even)
    # and any one of the odd ones left above (if any) to be placed in the middle
    oddOneLeft = 0
    maxPalindromeLength = 0
    for char, count in charCounts.items():
      if not count % 2: # count is even
        maxPalindromeLength += count
      else:
        maxPalindromeLength += count - 1
        oddOneLeft = 1
    return maxPalindromeLength + oddOneLeft

sol = Solution()
s1 = "abccccdd"
print("Longest palindrome of length {} can be formed using the characters {}.".format(sol.longestPalindrome(s1), s1))

s2 = "hjjjddddyyyyyrrrrriuuuihrwbjhhhhhhddduuu"
print("Longest palindrome of length {} can be formed using the characters {}.".format(sol.longestPalindrome(s2), s2))
