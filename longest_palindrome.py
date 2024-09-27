"""
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
// Your code here along with comments explaining your approach
Algorithm explanation
1) Since we don't have to consider order here, we add up 2 characters if they are same
meaning that using that characters, for sure palindrome will be formed.
2) Initiatlizing a empty set to keep track of the characters already present
    - Iterating over the string
        - If the character is not present in set, add it to set
        - Else , update the count by 2 and remove char from the set
    - If there are elements presents in the set( considering the middle elements)
        - Update count by 1 
"""
class Solution:
    def longestPalindrome(self, s: str) -> int:
        """
        BF - Check for all possible substrings which are palindrome and update the keep track of maximum length of the string
        s = "abbcbba"
        """
        char_set = set()
        max_len = 0
        for i in s:
            if i in char_set:
                char_set.remove(i)
                max_len+=2
            else:
                char_set.add(i)
        if char_set:
            max_len+=1
        return max_len