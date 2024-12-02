#Time complexity is O(n) and space complexity O(1)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashset=set()
        pl=0
        for i in s:
            if i in hashset:
                hashset.remove(i)
                pl+=2
            else:
                hashset.add(i)
                
        if len(hashset) >0:
            pl+=1           
            
        print(hashset)   
        return pl
