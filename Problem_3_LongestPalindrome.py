## Problem3 (https://leetcode.com/problems/longest-palindrome)

# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes.
# Any problem you faced while coding this : Initially, I used a stack to solve the problem. 
# Then optimized it with a dictionary. Issues with tackling the CARRY/SINGLE ELEMENT count and
# occurence. 


class Solution:
    def longestPalindrome(self, s: str) -> int:
        #SECOND METHOD using DICTIONARY
        dic={}
        ct=0
        for i in s:
            if i in dic:
                dic[i]+=1
            else:
                dic[i]=1
        temp_list=list(dic.values())
        carry=0 #Defining this varibale that determines if we need to add a MIDDLE ELEMENT or not based on whether the count is EVEN/ODD
        res=0
        for i in temp_list:
            if i%2==0:
                res+=i
            else:
                res+=(i-1)
                carry=1     #If the count is ODD, add the CARRY.
        return res+carry