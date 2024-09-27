"""

    Student : Shahreen Shahjahan Psyche

    Time Complexity : O(N)
    Space Complexity : O(1) [As my dictionary size will be at max 52 if all the alphabets are present for both capital and smaller letters]

    This code successfully passed all the test cases in leetcode


"""

class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        # edge case
        if s is None or len(s) == 0:
            return 0
        
        # saving the characters of the string in an dictionary with its number of occurances in the string
        records = {}
        
        for i in range(len(s)):
            if s[i] not in records.keys():
                records[s[i]] = 1
            else:
                records[s[i]] += 1
                
        
        length = 0
        flag = False
        
        # now, we know that if a string is a palindrome, then that means we need each character atleast equal to 2 counts or a multiple of 2 counts. Thats why I am 
        # adding the pairs in the lengths which I am getting from the records dictionary. Also, a palindrome with an odd length can have a single alphabet at the middle
        # thats why I am using the flag value to check whether any of the records entries have a value which is not a multiple of 2. Then we can incremeant the 
        # palindrome length by 1

        for i in records.keys():
            curr_val = (records[i]//2) * 2
            length += curr_val
            records[i] -= curr_val
            if records[i] != 0:
                flag = True
                
        if flag == True:
            length += 1
            
        
        return length