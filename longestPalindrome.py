class Solution:
    def longestPalindrome(self, s: str) -> int:
       # Optimize Approach
        charSet = set()
        count = 0
        for char in s:
            if char in charSet:
                charSet.remove(char)
                count+=2
            else:
                charSet.add(char)
        if len(charSet)!=0:
            count+=1
        return count                



                 



        
