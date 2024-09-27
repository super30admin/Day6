// Time Complexity :o(1)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes
class Solution(object):
    def longestPalindrome(self, s):
        if(s==None and len(s)==0):
            return 0
        d=set()
        count=0
        for i in s:
            if i in d:
                count+=2
                d.remove(i)
            else:
                d.add(i)
        if len(d) >0:
            count+=1
            return count
        else:
            return count
        

