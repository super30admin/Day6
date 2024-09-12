#O(n) time and O(n) space where n is length of string
# passed all test cases
class Solution:
    def longestPalindrome(self, s: str) -> int:
        char_counts = {}
        count = 0
        for char in s:
            if char not in char_counts:
                char_counts[char] = 0
            char_counts[char] += 1
        if len(char_counts) == 1:
            return len(s)
        odd_no = 0
        for key,value in char_counts.items():
            if value % 2 == 0:
                count += value
            elif value % 2 ==1 and value!=1:
                count+=(value-1)
                char_counts[key] = 1
        for key,value in char_counts.items():
            if value ==1:
                count += 1
                break
        return count