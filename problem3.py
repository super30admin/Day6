# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : N/A


# Your code here along with comments explaining your approach
# Create a set and iterate over the array
# If char is present that means there are 2 same chars and so it will make 
#   a palindrome of length 2, so add 2 to final count
# In the end there will be chars which are only a single copy, and hence one of them can be used to create palindrome
# in the middle, so add 1 to the final count

class Solution:
    def longestPalindrome(self, s: str) -> int:
        alph = set()
        cnt = 0
        for i in s:
            if i in alph:
                cnt += 2
                alph.remove(i)
            else:
                alph.add(i)
            
        if len(alph) != 0:
            cnt += 1
            
        return cnt