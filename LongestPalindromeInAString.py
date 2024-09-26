// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution:
    def longestPalindrome(self, s: str) -> int:
        di={}
        count=0
        for i in s:
            if i in di: # if character already in hash then add 2 into count ( 1 for current character , 1 for already present)
                count+=2
                del di[i]
            else: # if character not present , add it to hash
                di[i]=1
        
        if len(di.values())>0: # if hash is not empty, it means odd values are present, add single odd character to count
            count+=1
        return count
