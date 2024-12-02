# Python3 program to find the longest palindrome 

# Time Complexity : O(n)
# Space Complexity : O(n)
# Is this problem on Leetcode: Yes
# how to solve this problem:

# Function to find the longest palindrome 
def longestPalindrome(s):
	
	count = [0]*256                                     # to stores frequency of characters in a string
 
	for i in range(len(s)):                          # find freq of characters in the input string
		count[ord(s[i])] += 1

	start = ""
	mid = ""
	last = ""

	
	ch = ord('a')                                        # Characters present in a string
	while ch <= ord('z'):
		
		
		if (count[ch] & 1):                              # if the current character freq is odd
			
			mid = ch                                     # mid 

			
			count[ch] -= 1                               # -1 to make character even
			ch -= 1

		
		else:                                            # If it is even characters
		
			
			for i in range(count[ch]//2):
				start += chr(ch)
		ch += 1

	
	last = start

	last = last[::-1]

	
	return start + chr(mid) + last                          # return palindrome string

# Test case
s = "abbaccd"

print(longestPalindrome(s))


