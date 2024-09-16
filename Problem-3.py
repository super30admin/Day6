# 409. Longest Palindrome
# https://leetcode.com/problems/longest-palindrome/

# Time Complexiety: O(n)
# Space Complexiety: O(n)

class Solution:
    def longestPalindrome(self, s: str) -> int:
        temp_set = set()
        count = 0

        for i in s:
            if i in temp_set:
                temp_set.remove(i)
                count += 2
            else:
                temp_set.add(i)
        
        return count if not temp_set else count+1

obj = Solution()
print(obj.longestPalindrome('abccccdd'))
print(obj.longestPalindrome('a'))
print(obj.longestPalindrome('bb'))
