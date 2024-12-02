# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#saving the occurences of each character and checking for even number of
# occurences and saving the one extra odd occurence to put it in middle
class Solution:
    def longestPalindrome(self, s: str) -> int:
        if len(s) == 0:
            return 0
        a = {}
        count = 0
        for i in s:
            if i not in a:
                a[i] = True
            else:
                del a[i]
                count += 2
        if len(a) != 0:
            count += 1
        return count
        
        