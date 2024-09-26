# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
	# Iterate through the entire array,for every character in the string in a hashset
	# add the odd entries and remove of it is even entries and increamet the count by 2
	# At the end if the set still contains element then add 1 to the count else return the count
class Solution:
    def longestPalindrome(self, s: str) -> int:
        if not s:
            return -1
        
        MapSet = []
        count = 0
        for st in s:
            if st in MapSet:
                count += 2
                MapSet.remove(st)
            else:
                MapSet.append(st)
                
        if len(MapSet) != 0:
            count += 1
            
        return count
        
        