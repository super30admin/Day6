# Time Complexity O(n)
# Space Complexity O(m) all unique letters of s
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hash_set = set()
        max_len = 0

        for each in s:
            if each not in hash_set:
                hash_set.add(each)
            else:
                hash_set.remove(each)
                max_len += 2

        return max_len if not hash_set else max_len + 1