## Problem3 (https://leetcode.com/problems/longest-palindrome)

# Time Complexity : O(n)
# Space Complexity : O(n) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#Approach: Keep the list of counts for all the letters. And if the value in the list is divided by zero then add the value to count. If not, increment the one char count by 1.

class Solution:
    def longestPalindrome(self, s: str) -> int:
        d={}
        for i in s:
            if i not in d:
                d[i]=0
            d[i]+=1
        values1=list(d.values())
        one=0
        count=0
        for i in values1:
            if i%2==0:
                count+=i
            else:
                one=1
                count+=(i-1)
        return count+one
                