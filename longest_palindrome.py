class Solution:
    def longestPalindrome(self, s: str) -> int:
        '''O(n) time complexity
            O(1) space complexity'''
        
        hash_set=set()
        palindrome_length=0
        #iterate through the string
        for i in range(len(s)):
            #check if letter in the set,if not add it
            if s[i] not in hash_set:
                hash_set.add(s[i])
            else:
                #if letter in hash set remove it and add two to palindrome length
                hash_set.remove(s[i])
                palindrome_length+=2
        #at the end if there are letters in the hash set increment palindrome length by one
        if len(hash_set)>0:
            palindrome_length+=1
        return palindrome_length
            
       