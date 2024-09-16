class Solution:
    def longestPalindrome(self, s: str) -> int:
        palin_len={}
        odd=0
        even=0
        # Adding the string char and count to dictionary
        #Count is 0 if element is not present, else count is incremented by 1
        for i in range(len(s)):
            if(s[i] not in palin_len):
                palin_len[s[i]]=1
            else:
                palin_len[s[i]] += 1
        #If the value is even return value will be even value
        #Else sub 1 and add to palindrome sum
       
        for k in palin_len.keys():
            if(palin_len[k] % 2 ==0):
                even=even+ palin_len[k]
            else:
                even=even+ palin_len[k] -1
                 #default odd len is 1 
                odd=1
        return odd+even
        
        
        

