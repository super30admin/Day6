"""
Time complexity: O(n)
Space complexity: O(n)
Approach: Iterate over s and maintain a hashmap containing the frequency of each element.
        Once that is completed, iterate over the hashmap and add all the even number of elements in the hashmap
        to max_length. If a odd num exists, add one to the max_length at the end.
"""
class Solution:
    def longestPalindrome(self, s: str) -> int:
        if len(s) == 0 or len(s) == 1:
            return len(s)

        else:
            frequency = dict()
            for letter in s:
                if letter in frequency:
                    frequency[letter] += 1
                else:
                    frequency[letter] = 1

        result = 0
        has_odd = 0
        for letter in frequency:
            if frequency[letter] % 2 == 1:
                has_odd = 1
            result += frequency[letter] - (frequency[letter] % 2)
        result += has_odd

        return result