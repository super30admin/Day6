#Brute force- 
#time comp-O(n)
#space comp-O(1) took set but maximum values can be only unique alphabtes  

class Solution:
    def longestPalindrome(self, s: str) -> int:
        #find odd num of elements
        set1=set()
        for i in s:
            if i not in set1:
                set1.add(i)
            else:
                set1.remove(i)
        if len(set1)>0:
            return len(s)-len(set1)+1
        else:
            return len(s)
    
    
   
