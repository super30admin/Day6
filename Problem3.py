#Time Complexity : O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : YES
#Any problem you faced while coding this : NO
class Solution:
    def longestPalindrome(self, s: str) -> int:
        sett = set()
        count = 0
        for i in s:
            if i not in sett:
                sett.add(i)
            else:
                count +=2
                sett.remove(i)
        if sett:
            count +=1
            
        return count
                