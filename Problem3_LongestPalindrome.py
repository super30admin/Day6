'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
S30 SlackID : RN32MAY2021
=================================
'''

# 409. Longest Palindrome
# Given a string s which consists of lowercase or uppercase letters, 
# return the length of the longest palindrome that can be built with those 
# letters.

# Letters are case sensitive, for example, "Aa" is NOT considered a 
# palindrome here.

# Example 1:
# Input: s = "abccccdd"
# Output: 7
# Explanation:
# One longest palindrome that can be built is "dccaccd", whose length is 7.

# Example 2:
# Input: s = "a"
# Output: 1

# Example 3:
# Input: s = "bb"
# Output: 2

# Constraints:

# 1 <= s.length <= 2000
# s consists of lowercase and/or uppercase English letters only.

#-----------------
# Time Complexity: 
#-----------------
# O(N): Iterate over the entire string twice - 2 * N = O(N)
#------------------
# Space Complexity: 
#------------------
# O(1) - Maximum 26*2 characters (according to constraints) or 256 ASCII chars

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes
# Time             :   32 ms (69.57 %ile)
# Space            :   14.3 MB (53.69 %ile)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        char_count = {} # Dict to store character counts
        
        # Count the occurrences of each unique character in input
        for char in s:
            if char in char_count:
                char_count[char] += 1
            else:
                char_count[char] = 1

        
        largest_palindrome = 0
        
        for char in char_count:
            # Gets the highest even number of chars usable in making
            # a palindrome. 
            largest_palindrome += (char_count[char] // 2) * 2
            
            # If we have even number of chars, we can add 1 central character
            # and still have a palindrome.
            if char_count[char] % 2 == 1 and largest_palindrome % 2 == 0:
            # NOTE: once a character is chosen as central element, 
            # largest_palindrome becomes odd.
            # This condition is never reached again.
            # Because largest_palindrome is always incremented by an even value 
            # even+odd is always odd so this if is never reached again
                largest_palindrome += 1
                
        return largest_palindrome

obj = Solution()
print(obj.longestPalindrome("abccccdd")) 
print(obj.longestPalindrome("a")) 
