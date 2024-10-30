"Time Complexity of this code will be O(N) because we will be iterating through the string"
"Space Complexity of this code will be O(1) although we created a set because the length of the set is constant, and it wont increase beyond 26"

#Explanation

"To make a palindrome, we need a particular character in the string atleast twice."
"We have used a set here to make sure if it is present in an even times"
"If it is present twice, we increase the count by 2 and removing which is the key to make sure always we check if the freq is even"



class Solution:
    def longestPalindrome(self, s: str) -> int:
        myset = set()
        count = 0

        for char in s:
            if char in myset:
                count = count + 2
                myset.remove(char)
            else:
                myset.add(char)

        if len(myset) != 0:
            count = count + 1
        
        return count
        