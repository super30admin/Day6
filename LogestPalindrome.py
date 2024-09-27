'''
time complexity : O(n)
space Complexity : O(n)
'''
class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        char_dict = {}
        for letter in s:
            char_dict[letter] = char_dict.get(letter,0) + 1
       
        CharValues = list(char_dict.values())
        ll = 0 
        singleChar = 0
        for i in range(len(CharValues)):
            if(CharValues[i]%2==0):
                ll +=  CharValues[i]  
            else:
                ll += CharValues[i]-1
                singleChar = 1
                
        return ll + singleChar