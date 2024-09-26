class Solution:
    def longestPalindrome(self, s: str) -> int:
        

         
        dict1 = {}

        for i in s :
            if i not in dict1 :
                dict1 [i] = 1
            else :
                dict1 [i] += 1

        counteven  = 0
        countodd = 0
        counteven2 = 0
        for i in dict1 :
            if dict1[i] % 2 == 0 :
                counteven += dict1[i]
            else : 
                q,r = divmod (dict1[i],2)
                countodd +=1
                counteven2 += q

                
        if countodd != 0 :
            string = 2*counteven2 + counteven + 1
        else :
            string = 2*counteven2 + counteven

        return (string)
        
