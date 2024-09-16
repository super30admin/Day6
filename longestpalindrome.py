# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

from collections import defaultdict
class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        counteven = 0
        countodd = 0
        countmap = defaultdict(int)
        for ch in s:
            countmap[ch] += 1
            
        for k,v in countmap.items():
            if v%2==0:
                counteven += v
            if v%2==1:
                if v-1!=0:
                    counteven +=v-1
                    v = 1
                countodd = max(countodd,v)
        
        return counteven+countodd
                