from typing import Counter


class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        #Defining a hashset
        hash_set = set()
        sum =0

        for i in s:
            #if index not present as key in hash_set add the index value as key in hashset
            if i not in hash_set:
                hash_set.add(i)

            else :
                #else add 2 to the sum and remove the key index and vaue from hashset
                sum +=2
                hash_set.remove(i)
            
        if not hash_set:
            return sum
        else:
            return sum + 1
            
        
#This problem finds out the palindrome string length and we use a hashset to use this.
#Time complexity(O(n)) here n is the length of the whole string input.
#Space complexity O(1) here the number of enteries in hashset would be constant ie 52 characters. 