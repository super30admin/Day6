# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : NO

class Solution:
    def longestPalindrome(self, s: str) -> int:
        set1=set()
        count=0
        for i in range(len(s)):
            if s[i] not in set1:
                set1.add(s[i])
            else:
                set1.remove(s[i])
                count+=2
        if len(set1)!=0:
            count+=1
        
        
        return count