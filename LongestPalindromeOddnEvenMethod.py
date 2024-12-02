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
        
        # Using odd and even method
        
        #If string is empty return 0
        if len(s) == 0:
            return 0
        #If only 1 char in string return 1
        elif len(s)==1:
            return 1
        
        count=0
        mapping=dict()
        
        for ch in s:
            #Check if the key exits in the hashmap/dictionary
            if ch not in mapping.keys():
                mapping[ch]=1
            else:
                mapping[ch] +=1
                
        for key, value in mapping.items():
            #if even count all and remove
            if value % 2 == 0 :
                count +=value
                mapping.pop(key)
            #if odd and value > 1 then count only even and update the value to 1
            elif value > 1:
                count += value - 1
                mapping[key]=1
        
        if len(mapping) >= 1:
            return count + 1
        else:
            return count
                
                
