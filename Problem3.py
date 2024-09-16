## Problem3 (https://leetcode.com/problems/longest-palindrome)

#Solution 1 -> 

def LongestPalindrome(self, str1):
		char_dict = dict() # dictionary to store the count of each character in the str1
		for i in str1:
			if i not in char_dict:
				char_dict[i] = 0
			char_dict[i] += 1
		all_values = list(char_dict.values())
		one_character = 0
		max_length = 0
		for i in all_values:
			if i % 2 == 0: # If its even directly add that value to the longest palindrome string
				max_length += i
			else:
				max_length += (i - 1) # If its not even then add that (value - 1) which is an even again
				one_character = 1 # One character which is in the middle of the palindrome string
		return max_length + one_character

# Time Complexity -> o(n)
# Space Complexity -> o(n)