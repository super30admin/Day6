// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : passed 91/99
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach: counting total occurences of each alphabet



class Solution:
    def longestPalindrome(self, s: str) -> int:
        dic = {}
        
        for i in s:
            if i in dic:
                dic[i] += 1
            else:
                dic[i] = 1
                
        total = 0
        odd = 0
        
        for i in dic.values():
            if i%2 == 0:
                total += i
            if i%2 != 0 and i>2:
                total += i-1
                
        
        if len(dic)==1:
            return dic[s[0]]
        return total+1
