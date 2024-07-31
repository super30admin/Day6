# time: O(n)
# space: O(n)

class Solution(object):
    def longestPalindrome(self, s):
        pairs = set()
        cnt = 0
        for i in s:
            if i in pairs:
                cnt += 2
                pairs.remove(i)
            else:
                pairs.add(i)
        if len(pairs) != 0:
            cnt += 1
        return cnt
