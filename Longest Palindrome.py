class Solution:
    def longestPalindrome(self, s: str) -> int:
        dict1 = {}

        for i in s:
            if i not in dict1:
                dict1[i] = 1
            else:
                dict1[i] += 1

        if len(dict1) == 1:
            return dict1[s[0]]

        result = 0
        odd = 0

        for i in dict1.values():
            if i > 1:
                if i % 2 == 0:
                    result += i
                else:
                    result += i - 1
                    odd += 1
            else:
                odd += 1

        if odd > 1:
            result += 1
        return result

#TC = O(n)