"""
Time complexity :- O(n)
Space compleixty :- O(n)
"""
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hash_map = dict()
        cntr = 0
        for i in s:
            if i not in hash_map:
                hash_map[i] = 1
            else:
                hash_map[i] = hash_map.get(i) + 1

            if hash_map[i] % 2 == 0:
                cntr = cntr + 2

        for key, value in hash_map.items():
            if value % 2 != 0:
                cntr += 1
                break
        return cntr