class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        count = 0
        flag = False
        if not s:
            return -1  # Return -1 if the input string is empty

        hash_map = {}

        # Populate the frequency of each character
        for char in s:
            if char in hash_map:
                hash_map[char] += 1
            else:
                hash_map[char] = 1

        # Calculate the length of the longest palindrome
        for char in hash_map:
            freq = hash_map[char]
            if freq % 2 == 0:
                count += freq  # Add even frequency
            else:
                count += freq - 1  # Add the largest even part of odd frequency
                flag = True

        # Add 1 if there's at least one character with an odd frequency (can be placed in the middle)
        if flag:
            return count + 1
        else:
            return count


# time complexity is O(n) where n is the length of the string s
# space complexity is O(k) where k is the number of unique characters in the string
