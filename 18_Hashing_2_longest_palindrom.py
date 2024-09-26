#Time Complexity : O(N) where N is the numbers present in the list
#Space Complexity : O(N) for using one hashmap
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : Don't know how to solve by greddy approach

#Your code here along with comments explaining your approach

class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        d={}
        for i in range(len(s)): 
            if s[i] not in d: 
                d[s[i]]=1
            else: 
                d[s[i]]+=1
        
        #print(d)
        count=0
        flag=0
        for i in d: 
            if d[i]%2!=0 and d[i]>1: 
                count+=d[i]-1
                flag=1
            if d[i]%2==0: 
                count+=d[i]
            if d[i]==1: 
                flag=1
        
        if flag==0: 
            return count
        else: 
            return count+1