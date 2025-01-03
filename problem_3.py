#  Time Complexity : O(n)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No

# https://leetcode.com/problems/longest-palindrome/description/
#  Your code here along with comments explaining your approach 
#  I created hash set to store characters.
#  If character is already present in hash set then I remove it and increment result by 2. 

class Solution:
    def longestPalindrome(self, s: str) -> int:
        char_set = set()
        res = 0

        for char in s:
            if char in char_set:
                char_set.remove(char)
                res += 2
            
            else:
                char_set.add(char)
        
        if char_set:
            res += 1
        
        return res

# class Solution:
#     def longestPalindrome(self, s: str) -> int:
#         res = {}
#         odd = False
#         for i in s:
#             if i not in res:
#                 res[i] = 1
#             else:
#                 res[i] += 1
#         count = 0
        
#         for key,value in res.items():
#             if value % 2 == 0:
#                 count = count + value
#             else:
#                 count += value - 1
#                 odd = True
#         if odd:
#             return (count) + 1
#         else:
#             return (count)
