def longestPalindrome(self, s: str) -> int:
        
        count = 0
        dic = {}
        for char in s:
            if char not in dic:
                dic[char]=1
            else:
                dic[char]+=1
        
                
        for val in dic.values():
            if val%2==0:
                count+=val
            
            if val%2==1 and val!=1:
                count+=val-1
        
        if len(s)-count>0:
            return count+1
        else:
            
            return count
            
            
            '''aproach is basic. if no. of occurence is even add count+=number of occurence, if number of occurence is odd and not 1, count += number of occurence -1,
            if len(s)-count >0 , that means there are elements equal to len(s) - count with each occuring once. tc sc both o(n)'''
