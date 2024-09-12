 # Hashset Solution
 #Time Complexity : O(N ) where N is number of characters in string
# Space Complexity : O(1) where as hashset contains maximum of 26 upper or lower case characters 
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this :
class Solution:   
    def longestPalindrome(self, s: str) -> int:
            if s is None or len(s) == 0:
                return 0
            count = 0
            hashset = set()
            for i in range(0,len(s)):
                if s[i] in hashset:
                    count = count + 2
                    hashset.remove(s[i])
                else:
                    hashset.add(s[i])  
            if len(hashset) != 0:
                count = count + 1
            return count
    
#longestPalindrome('abccccdd')   