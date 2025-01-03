# Time complexity is O(n) - iterate through all the characters in the given string
# Space complexity is O(1) - storing the occurances of the characters and calculating count in constant time
class Solution:
    def longestPalindrome(self, s: str) -> int:
        if s is None or len(s) == 0:
            return 0

        if len(s) == 1:
            return 1

        count = 0
        hash_map = {}

        for letter in s:
            if letter in hash_map:
                hash_map.pop(letter)
                count += 2
            else:
                hash_map[letter] = 1
        if not len(hash_map) == 0:
            count += 1
        return count
            