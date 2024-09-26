class Solution:
    def longestPalindrome(self, s):
        char_set = set()
        count = 0
        
        for c in s:
            if c in char_set:
                count += 2
                char_set.remove(c)
            else:
                char_set.add(c)
        
        if char_set:
            count += 1
        
        return count

input_string = "abccccdd"
solution = Solution()
result = solution.longestPalindrome(input_string)
print("Longest Palindrome Length:", result)
