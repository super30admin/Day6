# Time Complexity: O(n)
# Space Complexity: O(1) -> space taken by hashmap is of fixed length 26 -> which is constant.
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this : No

from collections import defaultdict

class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        hashmap = defaultdict(int)
        
        for i in s:
            hashmap[i]+=1
        
        odd = 0
        for k, v in hashmap.items():
            if v%2!=0:
                odd+=1
        
        return len(s) if odd==0 else len(s)-odd+1
            