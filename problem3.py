## Space Complexity: O(n)
## Time Complexity: O(n)

class Solution:
    def longestPalindrome(self, s: str) -> int:
        d = {}
        for i in s:
            try:
                x = d[i]
                d[i] = x + 1
            except KeyError:
                d[i] = 1

        firstOdd = False
        cnt = 0
        for i in d:
            if d[i] % 2 == 1:
                if firstOdd is False:
                    cnt += d[i]
                    firstOdd = True
                else:
                    cnt += d[i] - 1
            else:
                cnt += d[i]
        return cnt
