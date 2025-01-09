# Time complexity - O(n)
# Space complexity - O(1)

# Approach - Maintain a set of chars and keep adding and removing them for odd and even
# count respectively. Once out of loop, check if set has any chars in it, if yes, append
# count by 1

class Solution:
    def longestPalindrome(self, s: str) -> int:
        char_set = set()
        count = 0

        for i in s:
            if i not in char_set:
                char_set.add(i)
            else:
                count += 2
                char_set.remove(i)
        
        if char_set:
            count += 1
        
        return count