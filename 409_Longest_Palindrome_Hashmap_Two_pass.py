# Time Complexity : O(n) [n = length of the input list]
# 
# Space Complexity : O(1) [The maximum length of the map is 52(considering all uppercase and lowercase alphabets)]
# 
# Did this code successfully run on Leetcode : Yes
# 
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
# 1. Iterate over each character in the string.
# 2. Add the character it in the count_map with char as the key and count of char as value.
# 3. Traverse the map to update the palindrome length as per the the count of the charaters 
class Solution:
    def longestPalindrome(self, s: str) -> int:
        count_map = {}
        for char in s:
            count_map[char] = count_map.get(char, 0) + 1
        length = 0
        
        # Traverse only unique character in s
        for char in set(s):
            if count_map[char] > 1:
                if count_map[char] % 2 == 0: # If it is even, increment the length by count corresponding to charatcter in map
                    length += count_map[char] 
                else: # If it is odd, increment the length by ((count / 2) * 2) corresponding to character in map and update the value for the key character to 1
                    length += (count_map[char] // 2) * 2
                    count_map[char] = 1
        
        hasCountOne = False
        # check if there is atleast one key in count_map with value 1 which can be used to form a palindrome
        for char in set(s):
            if count_map[char] == 1:
                hasCountOne = True
                break
                
        return length if not hasCountOne else length + 1