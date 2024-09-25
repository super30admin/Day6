# Time Complexity : O(n)
# Space Complexity : O(k) or 26 --> Number of unique alphabets 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : N/A

# Your code here along with comments explaining your approach
class Solution:
    def longestPalindrome(self, s: str) -> int:
        char_set = set() # Use a set to track characters
        count = 0
        for c in s:
            if c in char_set:
                count+=2
                char_set.remove(c)
            else:
                char_set.add(c)
        # If there are any characters left in the set, we can add 1 to the count
        if(len(char_set)>0):
            return count+1
        else:
            return count

