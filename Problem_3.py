# Time Complexity : O(n) where n is the length of the str1
# Space Complexity : O(n)  where n is the length of the str1 and we can ignore this because the size is fixed which is 256. Because we can have 256 characters at max
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Initially I was just adding the highest odd number from the dictionary values. It worked fine for this but failed on leet code. Then realized that we have to add all the even number values from the dictionary.

class Problem_3:
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

if __name__ == '__main__':
	s = "abccccdd" # One of the longest palindrome is dccbccd
	p3 = Problem_3()
	print(p3.LongestPalindrome(s))