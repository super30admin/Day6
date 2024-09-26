"""
Name: Srinidhi Bhat
Time Complexity: O(n)
Space Complexity: O(n)

Did it run on Leetcode: yes

Logic: palindrome can be formed around center with single char or set of two
to get the length, track number of paired and unpaired characters
number_of_paired*2+1 if unpaired exists else it is only number_of_paired*2
"""
class Solution:
    def longestPalindrome(self, s: str) -> int:
        if not s:
            return 0
        
        if len(s)==1:
            return 1
        
        unpaired_char = set()
        pair = 0
        for char in s:
            if char in unpaired_char:
                pair+=1
                unpaired_char.remove(char)
                
            else:
                unpaired_char.add(char)
        return pair*2+1 if unpaired_char else pair*2