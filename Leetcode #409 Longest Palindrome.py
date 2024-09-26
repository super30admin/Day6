# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def longestPalindrome(s):
        if len(s) == 0 or s is None:
            return 0

        hashset = set()
        count = 0
        for i in range(len(s)):
            if s[i] in hashset:
                count += 2
                hashset.remove(s[i])
            else:
                hashset.add(s[i])

        if len(hashset) != 0:
            count += 1

        return count        

