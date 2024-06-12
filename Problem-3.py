"""
The general idea is that for a string to be a palindrome, either of the below conditions should satisfy:
 1) The max len of the string should be 1
 2) A char needs to repeat more than once
    a) You can have multiple chars with either odd/even count of repetition
 3) if you have even count, all of them can be used to build the palindrome
    if you have odd count, these chars can be counted only in pairs. With this we can build a palindrome with even
    length. we can use one of the left of words from the odd count chars in the middle of the string and it will still
    be a valid palindrome.
    Examples:
    even and odd:  "aaeee" --> "aeeea" --> Palindrome, used all chars
    even and even: "aaee" --> "aeea" --> Palindrome, used all chars
    odd and odd:   "aaaeee" --> "aaeeea" --> NOT a Palindrome if used all chars --> "aeeea" , notice you had to leave
                                            one a
    "aaaeeeddd" --> "daeeead" , notice you can use only one of the chars from odd count of chars that were excluded to
                                form pairs

Approach 1 - use hashset to keep track of pairs
1) traverse through the string
2) if a char is not in set, add it. If it is already there, increase the count of pairs by 2 and remove it from set
3) This would always give us a palindrome of even length. if we can add another char in the middle of the palindrome,
    lets do that
   a) we can make this decision by comparing our palindrome length with that of the given string.

Approach 2 - use hashmap to keep track of all counts
1) create a counter
2) traverse through all key-values
3) if value is a pair, we increment our count by (# of pairs * 2). If no, count pairs only. Example,
    if value is 3, count only 2
    if value is 9, count only 8
4) if there was at least one odd count char in the counter, add 1 to your final count. meaning a char can be placed in
the middle of the palindrome

"""


class Solution:
    def longestPalindrome(self, s: str) -> int:
        # approach #1 -- using hashset
        """
        set_ = set()
        out = 0
        for char in s:
            if char in set_:
                set_.remove(char)
                out += 2
            else:
                set_.add(char)
        return out+1 if out < len(s) else out
        """
        # approach 2 -- using hashmap
        hashmap = defaultdict(int)
        odd = 0
        out = 0
        for char in s:
            hashmap[char] += 1

        for key, val in hashmap.items():
            if val % 2 == 1:
                odd = 1
                out += (val -1)
            else:
                out += val
        return out +odd

"""
For both Approaches
Time Complexity: O(n) 
Space Complexity: O(1) since we will be storing a max of 26 or 52 chars
"""