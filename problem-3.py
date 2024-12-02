# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        acc = set()
        count = 0
        for i in s:
            if i in acc:
                acc.remove(i)
                count += 2
            else:
                acc.add(i)
        if len(acc) == 0:
            return count
        else:
            return count + 1