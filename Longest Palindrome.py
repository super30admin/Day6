class Solution:
    def longestPalindrome(self, s: str) -> int:
        count, alreadySeen = 0, set()
        for letter in s:
            if letter in alreadySeen:
                alreadySeen.remove(letter)
                count += 2
            else:
                alreadySeen.add(letter)
        if len(alreadySeen) != 0:
            return count + 1
        else:
            return count
