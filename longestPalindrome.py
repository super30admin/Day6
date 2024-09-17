''#Longest Palindrome 
Time Complexity: 0(N) , Space Complexity: O(1)

approach  -> count all even number of characters and add 1 odd character which will be the middle elemenet. Use a hashset - add  charcter when you encounter a new character if you find it second time increase the count by 2 and remove the character. at the end if there are elements remaining ( odd number of characters) then add 1 to count '''

class Solution:
    def longestPalindrome(self, s: str) -> int:
        count =0
        hashset = set()
        for c in s:
            if c in hashset:
                count+=2
                hashset.remove(c)
                
            else:
                hashset.add(c)
        if len(hashset)>0:
            count+=1
        return count