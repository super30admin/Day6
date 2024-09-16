#longest palindrome
#letters are case sensitive
#solution made using set
#Time complexity: O(n) where n is the size of the string
#explaination
#set only takes unique characters
#we know that if the occurence of character is even then we can just return the size ,
#issue is when an occurence of character is odd
class Solution:
    def longestPalindrome(self, s: str) -> int:
        ref = set() #initalizing set
        for letter in s:#iterating through the string
            if letter not in ref:#so if the character is nto present add
                ref.add(letter)
            else:
                ref.remove(letter)#if present remove, in this all even characters will be removed
        if len(ref)!=0:#incase an odd character is encounted
            return len(s)-len(ref)+1#abccccdd -> 8-2 +1 , len(s)=8 and len(ref)=2
        else:
            return len(s)
        