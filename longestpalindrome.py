"""
Problem 409
Approach - Using Hashset. eg = "abccccdd"
0. Maintain a counter
1. Add each character in a hashset
2. Before adding a char check if a char is already present.
3. If yes, then add 2 to the counter. Remove the char which is already present in the hashset
4. Repeat till the end of string
5. Now the hashset will only have characters with odd number of occurences
6. Add 1 to the counter

TC - O(n)
SC = O(1)
"""

class Solution:
    def longestPalindrome(self, s: str) -> int:
        if s is None:
            return 0
        if len(s) == 1:
            return 1
        s_set = set()
        counter = 0
        for i in range(len(s)):
            if s[i] not in s_set:
                s_set.add(s[i])
            else:
                counter += 2
                s_set.remove(s[i])
        if len(s_set) != 0:
            counter += 1
        return counter
