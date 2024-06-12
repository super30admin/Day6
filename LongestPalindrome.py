#Time Complexity - O(n)
#Space Complexity - O(1) - Because there are only 26 alphabets

#Problem successfully submitted to leetcode
# No problems faced while coding this



class Solution:
    def longestPalindrome(self, s: str) -> int:
        temp=set()
        
        longest =0
        for i in range(len(s)):
            if s[i] in temp:
                longest=longest+2
                temp.remove(s[i])
            else:
                temp.add(s[i])
        if temp:
            return longest+1
        return longest