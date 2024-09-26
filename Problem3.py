class Solution(object):
    def longestPalindrome(self, s):
        
        n = len(s)
        if n == 0:
            return 0
        
        ans = 0
        mymap = {}
        for ch in s:
            if ch in mymap:
                mymap[ch]+=1
            else:
                mymap[ch] = 1
        
        no_of_odd = 0
        values = mymap.values()
        
        for val in values :
            if val%2 ==0:
                ans+=val
            
            elif no_of_odd == 0:
                    ans+=val
                    no_of_odd = 1
            else:
                ans += (val/2)*2
        return ans
        """
        :type s: str
        :rtype: int
        """
        