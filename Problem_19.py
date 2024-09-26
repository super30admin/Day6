# Time Complexity : O(n) where n is the length of the string
# Space Complexity : O(26) or constant auxiliary space needed for the hashmap which has a max of 26 keys for different alphabets
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def longestPalindrome(self, s: str) -> int:
        count = 0 # Initialize count to 0
        h = {} # Initialize dictionary
        for i in s: #Iterate through each character in the string
            if i in h.keys():
                # If the character is present in the keys of the dict then remove the key from dict and add 2 to the count
                count+=2  
                h.pop(i)
            else:
                h[i]=1 # If the character is not present in keys,create one for it
        if h.keys():
            count += 1 # AT the end if there are any elements lefyt over then the palindrome must be an odd length one with a charcter in the center, so add 1 to the count
        return count