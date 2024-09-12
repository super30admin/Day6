'''
LOGIC - Using Hashset
Time Complexity: O(N), where N is the length of the string
Space Complexity: O(1)
Successfully executed all the test cases
'''

class Solution:
    def longestPalindrome(self, s: str) -> int:
        temp = set()
        res = 0
        for i in s:
            if i not in temp:
                temp.add(i)
            else:
                res += 2
                temp.remove(i)
        if len(temp) != 0:
            res += 1
        return res
        