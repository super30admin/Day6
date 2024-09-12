#Time complexity: O(n) where n is the number of characters  
#Space complexity: O(n) where n is the number of characters and all characters are unique
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def longestPalindrome(self, s: str) -> int:
        count = 0
        # Hashset to save characters encountered
        mp = set()
        for el in s:
            #if char already there, second occurence encountered, remove because palindrome can be made
            if el in mp:
                mp.remove(el)
                count += 2
            #if not present, add that char
            else:
                mp.add(el)
        #if char present in the set still, use of these char for the mid, therefore plus 1
        if len(mp)>0:
            count +=1
        return count