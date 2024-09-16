#Hashset solution from class
#-----------------
# Time Complexity: 
#-----------------
# O(N): Iterate over the entire Once = O(N)
#------------------
# Space Complexity: 
#------------------
# O(1) - Maximum 26*2 characters (according to constraints) or 256 ASCII chars

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes
# Time             :   40 ms (8.77 %ile)
# Space            :   14.3 MB (53.69 %ile)


class Solution:
    def longestPalindrome(self, s:str) -> int:
        char_set = set()
        longest_palindrome = 0

        for char in s:
            if char in char_set:
                longest_palindrome += 2
                char_set.remove(char)
            else:
                char_set.add(char)

        if len(char_set) != 0:
            longest_palindrome += 1

        return longest_palindrome

obj = Solution()
print(obj.longestPalindrome("abccccdd")) 
print(obj.longestPalindrome("a")) 
