#409. Longest Palindrome
#TC->O(n)
#SC->O(1)



class Solution:
    def longestPalindrome(self, s: str) -> int:
        count = 0
        s = list(s)
        myList = []
        for i in range(len(s)):
            if s[i] not in myList:
                myList.append(s[i])
            else:
                myList.remove(s[i])
                count+=2
        if myList!=[]:
            count+=1
        
        return count
        
        
        
        
        
        