# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : N/A


# Your code here along with comments explaining your approach
from collections import Counter
def longestPalindrome(self, s: str) -> int:

    # Palindrome: Even count letters and only one odd count letter
    count = Counter(s)
    ans = 0
    for l, c in count.items():

        # Pair even count letters 
        ans += (c // 2 ) * 2

        # If odd count letter not selected yet, select the current one
        if (ans % 2 == 0 and c % 2 == 1):
            ans += 1
    
    return ans