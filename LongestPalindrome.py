#Time complexity:O(n)
#Space complexity:O(n)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        dict1,res,flag={},0,0
        for i in s:
            if i not in dict1:
                dict1[i]=1
            else:
                dict1[i]+=1
        for i in dict1:
            if(dict1[i]>=2 and dict1[i]%2==0):
                res+=dict1[i]
            elif(dict1[i]%2!=0):
                res+=dict1[i]-1
                flag=1
        if flag==1:
            return res+1
        else:
            return res
        