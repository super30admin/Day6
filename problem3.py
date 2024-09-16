#longest palindrome
#TC: O(N)
#SC:O(N)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashmap= {} #initializing dictionary
        for char in s: #iterating to keep character count
            if char not in hashmap:
                hashmap[char]=1
            else:
                hashmap[char]+=1
        
        count = 0
        odd = 0 #using a odd value counter
        
        for val in hashmap.values():
            if val%2==0:
                count+=val
            else:
                odd+=1
                count +=val
        
        return count if odd<=1 else count-odd+1