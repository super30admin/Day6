# Problem3 (https://leetcode.com/problems/longest-palindrome)

# Time Complexity: O(n) ; n = length of string
# Space Complexity: O(1) ; just storing 52 chars max
# Approach: If char not in hashset, add it. If it is in set, means it is coming for 2nd time, so add 2 to count and remove it. Repeat this till length of str.
# In the end, if length of set > 1, means it has one or more elements who has single ocurrence, so add 1 to count to consider that length of anyone of them.

# One pass Algo:
class Solution:
    def longestPalindrome(self, s: str) -> int:
        if not s:
            return 0
        hashset = set()
        count = 0
        for char in s:
            if char in hashset:
                count += 2
                hashset.remove(char)
            else:
                hashset.add(char)
        if len(hashset) > 0: # checking if any char with single occurence is there or not 
            count += 1
        return count


# Two pass Algo:
# class Solution:
#     def longestPalindrome(self, s: str) -> int:
#         if not s:
#             return 0
#         dc = {}
#         count = 0
#         for char in s:
#             if char not in dc.keys():
#                 dc[char] = 1
#             else:
#                 dc[char] += 1
#         for val in dc.values():
#             count += (val // 2) * 2 
#         return count+1 if count < len(s) else count