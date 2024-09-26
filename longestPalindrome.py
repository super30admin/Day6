# Time: O(n)
# Space: O(1)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        countMap = {}
        for i in s:
            if i not in countMap:
                countMap[i] = 1
            else:
                countMap[i] += 1
        even, odd = 0, 0
        for key in countMap:
            if countMap[key] % 2 == 0:
                even += countMap[key]
            else:
                odd += countMap[key] - 1
        if even == len(s):
            return even
        return (even + odd) + 1
