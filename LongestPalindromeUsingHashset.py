class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        
        '''// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach'''
        
        # Using hashset
        hashset=set()
        
        
        #If string is empty return 0
        if len(s) == 0:
            return 0
        #If only 1 char in string return 1
        elif len(s)==1:
            return 1
        
        count=0
        
        for ch in s:
            #Check if the key exits in the hashmap/dictionary
            if ch not in hashset:
                hashset.add(ch)
            else:
                count+=2
                hashset.remove(ch)
        
        if len(hashset) >= 1:
            return count + 1
        else:
            return count
                
                
