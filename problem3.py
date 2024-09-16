#Time Complexity O (n)
#Space Complexity O(1) constant time
class Solution:
    def longestPalindrome(self, s: str) -> int:
        data = dict()
        counter = 0
        for x in s:
            if x in data:
                counter+=2
                del data[x]
            else:
                data[x]=x
        
        if len(data.keys())>0:
            counter+=1
                    
        return counter
                
            
            
        
        
        
            
            
        
