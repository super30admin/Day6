'''
    Time Complexity:
        O(n)

    Space Complexity:
        O(1) (only 52 upper and lower case characters allowed)

    Did this code successfully run on LeetCode?:
        Yes

    Problems faced while coding this:
        None

    Approach:
        -> Create a set
        -> Set longest palindrome length = 0
        -> Traverse throught the string:
            -> If char is not in the set, add it.
            -> Else, remove it and add 2 the longest palindrome length var.
        -> Finally, if the set is not empty, add 1 to the longest palindrome length.
'''
class Solution:
    def longestPalindrome(self, s: str) -> int:
        st = set()
        longest_palin_len = 0

        for char in s:
            if char not in st:
                st.add(char)
            else:
                st.remove(char)
                longest_palin_len += 2

        if st:
            longest_palin_len += 1

        return longest_palin_len
