class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        dict1 = {}
        for i in s:
            if i in dict1:
                dict1[i]+=1
            else:
                dict1[i]=1
                
        
        sum1 = 0
        check =0
        for j in dict1:
            if dict1[j]>1:

                if dict1[j]%2==1 and check==0:
                    check =1
                    sum1 = sum1+ dict1[j]
                elif dict1[j]%2==0:
                    sum1 = sum1+ dict1[j]
                else:
                    sum1 = sum1+ dict1[j] -1
                
            elif check==0:

                sum1+=1
                check =1
        
        
        return sum1
