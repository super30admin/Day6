# Time Complexity : O(n)
# Space Complexity : O(1)
# This function calculates the length of the longest palindrome that can be formed using the characters of the given string. It uses a set to track characters. If a character is already in the set, it adds 2 to the count (1 for incoming and 1 for outgoing), and removes the character. After processing all characters, if the set is not empty, it adds 1 to the count to account for a central character in the palindrome. The function returns the total count.
class Solution:
    def longestPalindrome(self, s: str) -> int:
        if not s:
            return 0
        
        count = 0
        char_set = set()
        
        for char in s:
            if char in char_set:
                # Character already present in set
                count += 2
                char_set.remove(char) # Remove character from set to avoid duplication
            else:
                char_set.add(char)
        
        if char_set: # If there are still elements left in the set, update count
            count += 1
        
        return count

# Example 1
solution = Solution()
s = "abccccdd"
print(solution.longestPalindrome(s))  # Output: 7

# Example 2
s = "a"
print(solution.longestPalindrome(s))  # Output: 1

# Example 3
s = "aabbc"
print(solution.longestPalindrome(s))  # Output: 5

# Example 4
s = ""
print(solution.longestPalindrome(s))  # Output: 0
