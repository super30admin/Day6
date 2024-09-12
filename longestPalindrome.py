# Time Complexity : O(N)
# Space Complexity : O(1) O(1) because of letters can only be in the set which is 26 total. O(26) -> O(1)
# Did this code successfully run on Leetcode : Yes 
# Any problem you faced while coding this : No 


# Your code here along with comments explaining your approach

class Solution:
    def longestPalindrome(self, s: str) -> int:
        """
        - initial thoughts:
            from drawing examples:
                - palindrome can be made easy if there are even frequencies of a letter.
                - one single character can be in the middle
        simple problem can be solved with a set. put letter in the set,
        if letter has been in the set we can remove it and increase the length by 2. 
            If seen() set is > 0 at the end of traversing then that means there are just letters with one occurrence
        """
        maxLength = 0
        seen = set()
        
        for i in s:
            if i in seen:
                seen.remove(i)
                maxLength += 2
            else:
                seen.add(i)
        if len(seen) > 0:
            return maxLength + 1
        return maxLength