#TC = O(n)
#SC= O(n)

class Solution:
    def longestPalindrome(self, s: str) -> int:
        map1={}
        ans=0
        count=0
        for key in s:
            if key not in map1:
                map1[key] =1
            else:
                map1[key]+=1
                
        for key in map1.keys():
            if map1[key]%2 == 0:
                ans +=map1[key]
            else:
                ans +=map1[key] -1
                count =1
        if count: 
            return ans+count 
        else:
            return ans