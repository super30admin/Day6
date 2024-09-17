#Time complexity: O(n)
# Space complexity: O(n)
# Worked on leetcode
# The algorithm checks for the pair of same characters. It uses a hashset to add character is that character is not present
# in the hashset, and it removes that character otherwise. This will eliminate all the characters which are present in pairs
# from the hashset, and adds 2 to the count for each existing pair. THe remaining characters in the hashset can be taken as the
# center element of the palindrome, which increments the count by 1.


class Solution:
    def longestPalindrome(self, s: str) -> int:

        Hashset = set()
        count = 0

        for char in s:
            if char in Hashset:
                Hashset.remove(char)
                count += 2

            else:
                Hashset.add(char)

        if (len(Hashset) != 0):
            count += 1

        return count


result = Solution()

print(result.longestPalindrome("abccccdd"))