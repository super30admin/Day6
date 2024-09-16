
"""
Time Complexity : O(N) as we have to traverse through the given string
Space Complexity : O(k) where k <N (N is the no. of elements in the string) k is the unique no. of values in hashset
"""

class Solution:
    def longestPalindrome(self, s: str) -> int:
        #Edge case check
        if len(s) == 0:
            return 0
        
        #create an integer list to return the palindrome
        lis = []
        ctr = 0 #have a counter to count the values
        #consider s as a set
        #iterate through set s and look for the frequencies of every element of s
        #if count is even, append to the output list, else increment count to 2
        
        for i in set(s):
            if(s.count(i)%2 != 0):
                lis.append(i)
            ctr += (s.count(i)//2)*2

        if(len(lis)!=0) :#check for an empty list
            return(ctr + 1) #add additional character from the set
        else:
            return(ctr)

s = " "
S = Solution()
print(S.longestPalindrome(s))