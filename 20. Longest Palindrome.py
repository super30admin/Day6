# Time Complexity: O(n)
# Space Complexity: O(n)

class Solution:
    def longestPalindrome(self, s: str) -> int:
        hash_set = []
        count = 0
        for i in s:
            if i not in hash_set:
                hash_set.append(i)
            else:
                hash_set.remove(i)
                count = count + 2
        if hash_set:
            count = count + 1
            return count
        else: return count