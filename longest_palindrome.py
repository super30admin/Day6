# Time Complexity :
# O(N)  - Length of the string

# Space Complexity :
# O(1) - the hasp map size has a max limit of 26

# Did this code successfully run on Leetcode :
#Yes

# Any problem you faced while coding this :
#No

#Count the number of occurances of each of the characters
#If they appear even number of times, then they can be part of palindrome - so add their count to max size
#If a appears odd number of times, then we can use it even number of times (count-1) and discard the last occurance. Also, one character can have odd number of occurances

class Solution:
    def longestPalindrome(self, s: str) -> int:
        map1 = {}
        max_size = 0
        odd_exists = False
        for i,character in enumerate(s):
            if character in map1:
                map1[character] += 1
            else :
                map1[character] = 1

        for key,values in map1.items():
            if values % 2 == 0 :
                max_size += values
            else :
                odd_exists = True
                max_size += (values-1)

        if odd_exists :
            max_size += 1
        return max_size
