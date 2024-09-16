class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        h={}
        ans=0
        flag=0
        for i in s:
            if(i not in h):
                h[i]=1
            else:
                h[i]+=1
        for i in h:
            if(h[i]%2==0):
                ans+=h[i]
            else:
                ans+=h[i]-1
                flag=1
        if(flag==1):
            return ans+1
        return ans
                
        