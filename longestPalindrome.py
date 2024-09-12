class Solution:
    def longestPalindrome(self, s: str) -> int:
        if len(s) == 1:
            return 1
        
        c = set()
        counter = 0
        #print(c,counter)
        
        for char in s:
            if char in c:
                c.remove(char)
                counter+=2
             #   print(c,counter)
                
            else:
                c.add(char)
            #    print(c,counter)
                
        
        if c != set([]):
            counter +=1
         #   print("in if, ",counter)
        
        return counter
            
    
    
#time complexiity - O(n)
#space =  O(1)