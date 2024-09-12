//Time compexity: O(n)
//space complexity: O(n)

class Solution:
    def longestPalindrome(self, s: str) -> int:
        pair = 0
        unpair = set()
        for i in s:
            if i in unpair:
                pair += 1
                unpair.remove(i)
            else:
                unpair.add(i)
        if unpair:
            return pair*2 + 1
        else:
            return pair*2
