# Use hashset to store every occurence, if it occurs again add 2 t ocount and remove it from hash set. If it's not empty add 1 to count and return
# TC: O(n)
# SC: O(1)
# Yes, this worked in leetcode

class Solution:
    def longestPalindrome(self, s: str) -> int:
        if len(s) == 0:
            return 0
        res = set()
        count = 0
        for i in s:
            if i in res:
                count+=2
                res.remove(i)
            else:
                res.add(i)
        if len(res)!=0:
            count+=1
        return count
