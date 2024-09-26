// Time Complexity :o(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution(object):
    def longestPalindrome(self, s):
        
        leng= len(s)
        count = 0
        dict = {}
        for i in range(leng):
            if(s[i] in dict.keys()):
                count+=2
                dict.pop(s[i])
            else:
                dict[s[i]] = 0
         
        if(len(dict)>0):
            return count+1
        else:
            return count 
