# Time Complexity = O(n) Space Complexity = O(1)

class Solution:
    def longestPalindrome(self, s: str) -> int:
        if s is None or len(s) == 0:
            return -1
        count = 0
        hash_set = set()

        for i in range(0, len(s)):

            if s[i] in hash_set:
                count += 2
                hash_set.remove(s[i])
            else:
                hash_set.add(s[i])
            i += 1

        if hash_set:
            count += 1

        return count
