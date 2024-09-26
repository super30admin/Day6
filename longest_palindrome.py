# Time Complexity : O(N), traversisng elements in array, hashmap search is constatnt time
# Space Complexity : O(N), 
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution(object):
    def longestPalindrome(self, s):
        count = 0
        hashset = set()
        for char in s:
            if char in hashset:
                count += 2
                hashset.remove(char)
            else:
                hashset.add(char)
        
        if hashset:
            count += 1
        
        return count       
