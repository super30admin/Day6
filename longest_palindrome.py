class Solution:
    def longestPalindrome(self, s: str) -> int:
        my_arr=[]
        count=0
        
        for i in range(0,len(s)):
            if s[i] in my_arr:
                count+=2
                my_arr.remove(s[i])
            else:
                my_arr.append(s[i])
        
        if len(my_arr)>=1:
            count+=1
        
        return count