// Time Complexity :O(n)
// Space Complexity :O(n) worst case
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no
// Your code here along with comments explaining your approach
// my approach is using set we keep track of odd number count in the string and add one to the final result.
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hash = set()
        for c in s:
            if c not in hash:
                hash.add(c)
            else:
                hash.remove(c)
        # len(hash) is the number of the odd letters
        return len(s) - len(hash) + 1 if len(hash) > 0 else len(s)