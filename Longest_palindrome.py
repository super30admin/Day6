# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def longestPalindrome(self, s: str) :
        count = 0
        hashmap = {}
        # Maintain hashmap with elements and its count
        for i in range(len(s)):
            if s[i] in hashmap:
                hashmap[s[i]] += 1
            else:
                hashmap[s[i]] = 1

        
        for i in hashmap:
            if hashmap[i] % 2 != 0:
                count += hashmap[i] - 1
                hashmap[i] = hashmap[i] - (hashmap[i] - 1)
            else:
                count += hashmap[i]
                hashmap[i] = 0
        
        
                
                
                
                
        