class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        #O(N)
        #O(1) as letters are lower and upper
        #flag for extra odd character in middle
        mp={}
        flag=0
        l=len(s)
        #maintain count map
        for i in s:
            mp[i]=mp.get(i,0)+1
        #for every key in map
        for i in mp:
            #if value is odd>>flag set>>length reduced
            if mp[i]%2==1:
                flag=1
                l-=1
        #if flag then just add one to length as one odd is allowed in middle
        if flag==1:
            return l+1
        #return complete length of even chars
        else:
            return l
        