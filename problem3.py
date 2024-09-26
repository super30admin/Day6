# Time Complexity : O(N), 
# Space Complexity :O(1)

# Did this code successfully run on Leetcode : 
# YEs

# Any problem you faced while coding this : 

# Your code here along with comments explaining your approach
class Solution:
    def longestPalindrome(self, s: str) -> int:
        if len(s)==0:
            return 0
        count = 0
        hashset = []
        for each in s:
            if each in hashset:
                count+=2
                hashset.remove(each)
            else:
                hashset.append(each)
        if len(hashset)!=0:
            count+=1
        return count   
        