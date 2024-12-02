class Solution:
    def longestPalindrome(self, s: str) -> int:
        from collections import defaultdict, Counter
        if len(s) == 1:
            return 1

        palin = Counter(s)
        pal = set()
        output = 0
        flag = True

        for idx, val in enumerate(s):
            if val in pal:
                pal.remove(val)
                output += 2
            else:
                pal.add(val)

        if len(pal) > 0:
            return output + 1
        else:
            return output