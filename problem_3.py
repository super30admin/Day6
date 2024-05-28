# Time complexity O(n)
# Space Complexity O(1)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        if not s:
            return 0
        hash_set = set()
        count = 0
        for char in s:
            
            if char in hash_set:
                count += 2
                hash_set.remove(char)
            else:
                hash_set.add(char)

        if hash_set:
            count += 1
        return count
            


        