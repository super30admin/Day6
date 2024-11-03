# The code defines a longestPalindrome method to find the length of the longest palindrome that can be formed using the characters in a given string.
# The approach uses a set to track characters that appear an odd number of times.
# 
# In each iteration:
#   - For each character in the string (s[i]), it checks if the character is already in the set:
#       - If the character is in the set, it means it has now appeared an even number of times, so we remove it from the set and increase the palindrome length (ans) by 2.
#       - If the character is not in the set, it is added to the set, marking it as having appeared an odd number of times.
# 
# After the loop, if there are characters left in the set (i.e., characters with odd occurrences), we can place one of them in the center of the palindrome, so we add 1 to the length.
# If the set is empty, the palindrome length remains as calculated.
# 
# TC: O(n) - The time complexity is linear as each character is processed once.
# SC: O(k) - The space complexity depends on the unique characters in the string, with k being the number of unique characters.


class Solution:
    def longestPalindrome(self, s: str) -> int:
        set_ = set()
        ans = 0
        for i in range(len(s)):
            if s[i] in set_:
                set_.remove(s[i])
                ans += 2 
            else:
                set_.add(s[i])
        return ans + 1 if set_ else ans 