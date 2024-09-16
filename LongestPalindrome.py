# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# We get frequency count of all values of array. If count is even that means all elements can be used in the palindrmic string.
# If it is odd then the nearest smaller even value (i.e count-1) can be used in the palindrome
# 1 more value from the odd count can be used as the middle element of the palindrome.
from collections import defaultdict,Counter
class Solution:
    def longestPalindrome(self, s: str) -> int:
        resLen=0
        oddLenExists=False
        freq=defaultdict(int)
        freq=Counter(s)
        for v in freq.values():
            if v%2==0:
                resLen+=v
            if v%2==1:
                resLen+=v-1
                oddLenExists=True
                
        return (resLen+1) if oddLenExists==True else resLen
            