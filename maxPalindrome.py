# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach


class Solution:
    def longestPalindrome(self, s: str) -> int:
        letter_count = collections.Counter(s)
        odd = False
        max_len = 0
        for k in letter_count:
            v = letter_count[k]
            if v % 2 == 0:
                max_len += v
            else:
                odd = True
                max_len += v-1
                    
        
        return max_len + 1 if odd else max_len