#Time Complexity: O(n)
#Space Complexity: O(n)
#Problem sucessfully accepted in leetcode: yes
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashset={}
        palindrome=0
        for i in range(len(s)):
#If character present in hashset, increase palindrome by 2 and remove entry from hashset
            if s[i] in hashset:
                palindrome+=2
                del hashset[s[i]]
            else:
#If not present, add character and present index to set
                hashset[s[i]]=1
#If hashset contains elements with odd no.s, increment palindrome size by 1
        if hashset:
                palindrome+=1
        return palindrome