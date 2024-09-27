'''
Time Complexity: O(n)
Space Complexity: O(n) but can be consider O(1) as we are considering only 26 alphabets and 56 alphabets in case we consider bot upper and lower case.
Leetcode: Success!
Problems: None
'''

class Solution:
    def longestPalindrome(self, s: str) -> int:
        # Initialize the length variable to calculate the length of the palindrome 
        # Initialize the check list to implement as an Hashset to store and keep track of characters visited.
        length = 0
        check = []
        for i in s:
            # check if the character already exists in the list, if not then add it to list
            if i not in check:
                check.append(i)
                # print("Appended: ",check)
            # If the character already exists in the list then remove the character and increment the length by two
            # we increment the length by two as we count the occurances of both the char in the list and the one currectly being pointed.
            else:
                check.remove(i)
                # print("Removed: ",check)
                length+=2
        # Chcek if there are any remaining char or if the list is empty
        if len(check)!=0:
            # if the list is not empty that means these ar the chars with odd number of occurances and cab be used in palindrome as "ccdadcc" where 'a' is odd
            length+=1
        # return the length of the longest palindrome
        return length


sol = Solution()
s = "abcccdd"
'''
s = "a"
s = "bb"
'''
l = sol.longestPalindrome(s)
print("Longest Palindrome: ",l)

