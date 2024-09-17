'''
409. Longest Palindrome
TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(N) 
LEETCODE: Yes
Any Difficulty: No
'''

class Solution:
    def longestPalindrome(self, s: str) -> int:
        ln = 0
        cnt_set = set({})
        for char in s:
            if char not in cnt_set:
                cnt_set.add(char)
            else:
                ln += 2
                cnt_set.remove(char)
        
        if len(cnt_set):
            return ln + 1
        
        return ln
