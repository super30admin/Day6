'''
Time complexity: O(n)
Space complexity: O(1) - as the set will have at most 26 characters.
Did this code successfully run on Leetcode : Yes. (#409)
Any problem you faced while coding this : No.
Approach:
We can use a set to store the characters of the string. If a character is already in the set, we can remove it from the set and increase the count by 2.
If the character is not in the set, we can add it to the set. In the end, if the set is not empty, we can add 1 to the count as we can have only one character in the middle of the palindrome.
'''

class Solution:
    def longestPalindrome(self, s: str) -> int:
        charSet = set()
        count = 0
        for ch in s:
            if ch in charSet:
                count+=2
                charSet.remove(ch)
                continue
            charSet.add(ch)
        if len(charSet) > 0:
            return count+1
        return count
    

#driver code
sol = Solution()
print(sol.longestPalindrome("abccccdd")) #7