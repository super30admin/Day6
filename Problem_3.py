class Solution:
	def longestPalindrome(self, s: str) -> int:
		if not s:
			return 0
		hashset = []
		count = 0
		for char in s:
			if char in hashset:
				count+=2
				hashset.remove(char)
			else:
				hashset.append(char)
		if len(hashset)>0:
			return count+1
		else:
			return count

#time_complexity - O(n) [but I think its supposed to be O(n^2) as while iterating through the string, the hashmap is also iterated to find the char]
#space_complexity - max - O(52) //maximum number of characters possible
#all test cases passed