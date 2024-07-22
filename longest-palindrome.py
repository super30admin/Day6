#Time complexity O(n)
#Space complexity O(1)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        unique_char = set()

        # track the longest palindrome
        count = 0
        for char in s:
            if char in unique_char:
                count += 2
                unique_char.remove(char)
            else:
                unique_char.add(char)
        if len(unique_char) > 0:
            count +=1
        return count
        