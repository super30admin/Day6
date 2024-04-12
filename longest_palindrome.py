# // Time Complexity : O(n) (as we iterate through string, n is no of alphabets in string)
# // Space Complexity : O(1) (at most only 26 letters are present which is constant irrespective of length of string)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : no


# // Your code here along with comments explaining your approach

# Intution: track the freq of letters in str, if its all even , add them and return else there is a odd freq, then add +1 to return value , return value is sum of all even freq values

# create a hashmap and iterate through the string to store frequency of letters in hashmap
# no iterate through the hashmap to count the longest plaindrome
# if you encounter odd frequency , remove 1 and add it to count , and offflag is true idicating we have encountered a odd freq 
# add freq to count without any calculation if its even

# coming to return values , if offFalg is true , add 1 to count and return ,  as we can place a odd letter in the middle
# if its False ie oddFlag, return count 



class Solution:
    def longestPalindrome(self, s: str) -> int:
        charMap = {}
        str = ''.split(s)
        for i in s:
            count = charMap.get(i)
            if count:
                charMap[i] = count + 1
            else:
                charMap[i] = 1
        offFlag = False
        Longcount = 0
        for k, v in charMap.items():
            if v % 2 == 0 :
                Longcount = Longcount + v
            else:
                Longcount = (Longcount + v) - 1
                offFlag = True
        if offFlag:
            return Longcount + 1
        else:
            return Longcount
