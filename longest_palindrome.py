#Time complexity = O(n)
#Space complexity = O(1)
#Leetcode = yes
#Approach = Used a hash set to track characters with odd occurrences. For each character, if it exists in the set, add 2 to the count and remove it; otherwise, add it to the set. If the set is non-empty at the end, add 1 to the count for the center character of the palindrome.
class Solution:
    def longestPalindrome(self, s: str) -> int:
        count = 0
        hashset = set()

        for c in s:
            if c in hashset:
                count += 2
                hashset.remove(c)
            else:
                hashset.add(c)
        
        if hashset:
            count += 1
        
        return count