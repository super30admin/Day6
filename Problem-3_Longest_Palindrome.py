# APPROACH 1: (My approach before class) 
# Time Complexity : O(s) - s is the length of string s.
# Space Complexity : O(1) as total number of keys that hashmap can have is 26 (all letters) and values are only int.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Initially, didn't consider that more than one letter can have odd occurrence. And also from the odd count of char can consider the
#                                           even pairs count.
#
# Your code here along with comments explaining your approach
# 1. Build a hashmap where key is the char and value is the count of occurrence of char in s. 
# 2. Go through hashmap, sum up all the even pairs count
# 3. If any count is odd, then add 1 to final count at the end. (as this char can act as middle letter)

class Solution:
    def longestPalindrome(self, s: str) -> int:
        if not s:
            return 0
        
        hashmap = {}
        
        for char in s:
            if char in hashmap:
                hashmap[char] += 1
            else:
                hashmap[char] = 1
        
        flag_odd, even_length = 0, 0
             
        for key in hashmap:
            if hashmap[key] % 2 == 0:
                even_length += hashmap[key]
                
            if hashmap[key] % 2 != 0:
                flag_odd = 1
                even_length += (hashmap[key] - 1)
                
        if flag_odd == 0:
            return even_length
        else:
            return even_length + 1
            
            
            
# APPROACH 2: Same approach (INSTEAD OF HASHMAP USE HASHSET)
# Time Complexity : O(s) - s is the length of string s.
# Space Complexity : O(1) as total number of items that hashset can have is 26 (all letters)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Create a hashset. 
# 2. For each char in s: -> If char in hashset, remove it and inc length by 2 (there exist a pair of these letters that can be added to final palindrome)
#                        -> If char not in hashset, add to hashset
# 3. At the end, if hashset has some chars left (potential middle candidates) then inc length by 1.


class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        if not s:
            return 0
        
        hashset, length = set(), 0
        
        for char in s:
            if char in hashset:
                length += 2
                hashset.remove(char)
                
            elif char not in hashset:
                hashset.add(char)
                
        if len(hashset) != 0:
            length += 1
            
        return length
        
