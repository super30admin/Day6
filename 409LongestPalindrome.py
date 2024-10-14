# Time complexity = O(n), Space complexity = O(1) as the set can contain max characters of 52 (worst case scenario) which is constant.
class Solution:
    def longestPalindrome(self, s: str) -> int:
        char_set = set()
        count = 0
        singleFlag = False
        for ch in s:
            if ch in char_set:
                count += 2
                char_set.remove(ch)
            else:
                char_set.add(ch)
        if char_set:
            count += 1
        return count