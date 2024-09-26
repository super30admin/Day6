# Time Complexity: O(N)
# Space Complexity: O(N)
# Leetcode all test cases passed: Yes
# Any difficulties: No

class Solution:
    def longestPalindrome(self, s: str) -> int:
        dic = set()
        count = 0
        for ch in s:
            if ch not in dic:
                dic.add(ch)
            else:
                dic.remove(ch)
                count += 2
        if dic:
            count += 1
        return count
            
