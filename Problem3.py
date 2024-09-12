# Longest Pallindrom

# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes, Runtime: 36 ms and Memory Usage: 14.3 MB
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
# Approach
"""
Using HashSet which stores values every character is checked for its presence in the
hashset. If the character is not present add it, if character is present increment 
the count variable initialized by 2. Pairing is done as "aa" so the variable count is 
incremented by 2 and the character is removed.

"""
class Solution:
    def longestPalindrome(self, s: str) -> int:
        if(s==None or len(s)==0): # Edge Cases Checking
            return 0
        count=0
        hash_set=set() # HashSet specified
        for i in s:
            if i in hash_set: # if hash_set contains charcater increment count by 2 and remove
                count=count+2 
                hash_set.remove(i)
            else:
                hash_set.add(i)
        if(len(hash_set)>0): # if size of hash_set is greater than zero increment by 1
            count=count+1
        return count